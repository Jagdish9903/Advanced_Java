import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JTextArea;
import java.awt.Rectangle;
import javax.swing.JTable;

public class FrameDb extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	public static Connection con;
	public static Statement s;
	public static ResultSet rs;
	String query,name,branch;
	int salary,a;
	public JTextArea t;
	public JTable table;
	/**
	 * @wbp.nonvisual location=-48,344
	 */
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
			//s = con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println("caught an exception!" + e);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDb frame = new FrameDb();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameDb() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 580);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 200, 40));
		contentPane.setEnabled(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(82, 37, 56, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBranch.setBounds(82, 83, 56, 26);
		contentPane.add(lblBranch);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSalary.setBounds(82, 132, 56, 26);
		contentPane.add(lblSalary);
		
		t1 = new JTextField();
		t1.setBounds(165, 41, 279, 21);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(165, 88, 279, 21);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(165, 137, 279, 21);
		contentPane.add(t3);
		
		JButton b1 = new JButton("Insert");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(table != null)
					{
						table.setVisible(false);
						contentPane.remove(table);
					}
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
					s = con.createStatement();
					name = t1.getText();
					branch = t2.getText();
					salary = Integer.parseInt(t3.getText());
					query = "Insert into friends values (" + 0 + ",'" + name + "', '" + branch + "', " + salary + ")";
					a = s.executeUpdate(query);
					t = new JTextArea();
					t.setBounds(new Rectangle(76, 352, 368, 147));
					//t.setBounds(76, 352, 368, 147);
					t.setEditable(false);
					t.setLineWrap(true);
					t.setWrapStyleWord(true);
					//t.setBounds(76, 352, 368, 147);
					contentPane.add(t);
					if(a > 0)
					{
						t.setText("Inserted the row successfully!");
					}
					else
					{
						t.setText("Failed to insert the row!");
					}
				}
				catch(Exception e2)
				{
					System.out.println("caught an exception!" + e2);
				}
			}
		});
		b1.setBounds(82, 227, 99, 33);
		contentPane.add(b1);
		
		JButton b2 = new JButton("View");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(t != null)
					{
						contentPane.remove(t);
					}
					ArrayList<ArrayList<String>> ans = new ArrayList<>();
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
					s = con.createStatement();
					String query = "Select * from friends";
					s.execute(query);
					ResultSet rs = s.getResultSet();
					while(rs.next())
					{
						ArrayList<String> tmp = new ArrayList<>();
						System.out.println("ID : " + tmp.add(rs.getString(1)));
						System.out.println("Name : " + tmp.add(rs.getString(2)));
						System.out.println("branch : " + tmp.add(rs.getString(3)));
						System.out.println("salary : " + tmp.add(rs.getString(4)));
						ans.add(tmp);
					}
					int row = ans.size();
					int col = ans.get(0).size();
					String cols[] = {"ID", "Name", "Branch", "Salary"};
					System.out.println("row : " + row + " col : " + col);
					String res[][] = new String[row][col];
					for(int i = 0; i < row; i++)
					{
						ArrayList<String> tmp2 = ans.get(i);
						res[i] = tmp2.toArray(new String[0]);
						for(int j = 0; j < res[i].length; j++)
						{
							System.out.print(res[i][j] + "\t");
						}
						System.out.println();
					}
					/*if(table != null)
					{
						contentPane.remove(table);
					}*/
					table = new JTable(res,cols);
					table.setBounds(50, 300, 500, 200);
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.setCellSelectionEnabled(true);
					//table.setEnabled(false);
					table.setVisible(true);
					contentPane.add(table);
					
					//below two lines are interesting, i was struggling to get content of table but these two lines made it work
					contentPane.repaint();
					contentPane.revalidate();
					
					/*
					name = t1.getText();
					branch = t2.getText();
					salary = Integer.parseInt(t3.getText());
					a = s.executeUpdate(query);
					t = new JTextArea();
					t.setBounds(new Rectangle(76, 352, 368, 147));
					//t.setBounds(76, 352, 368, 147);
					t.setEditable(false);
					t.setLineWrap(true);
					t.setWrapStyleWord(true);
					//t.setBounds(76, 352, 368, 147);
					contentPane.add(t);
					if(a > 0)
					{
						t.setText("Deleted the row successfully!");
					}
					else
					{
						t.setText("No such row exists!");
					}*/
					s.close();
					con.close();
				}
				catch(Exception e2)
				{
					System.out.println("caught an exception!" + e2);
				}
			}
		});
		b2.setBounds(217, 227, 99, 33);
		contentPane.add(b2);
		
		JButton b3 = new JButton("Delete");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(table != null)
					{
						table.setVisible(false);
						contentPane.remove(table);
					}
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
					s = con.createStatement();
					name = t1.getText();
					branch = t2.getText();
					salary = Integer.parseInt(t3.getText());
					query = "delete from friends where name = '" + name + "' and branch = '" + branch + "'and salary = " + salary;
					a = s.executeUpdate(query);
					t = new JTextArea();
					t.setBounds(new Rectangle(76, 352, 368, 147));
					//t.setBounds(76, 352, 368, 147);
					t.setEditable(false);
					t.setLineWrap(true);
					t.setWrapStyleWord(true);
					//t.setBounds(76, 352, 368, 147);
					contentPane.add(t);
					if(a > 0)
					{
						t.setText("Deleted the row successfully!");
					}
					else
					{
						t.setText("No such row exists!");
					}
				}
				catch(Exception e2)
				{
					System.out.println("caught an exception!" + e2);
				}
			}
		});
		b3.setBounds(349, 227, 99, 33);
		contentPane.add(b3);
	}
}
