import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class table extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table frame = new table();
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
	public table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String cols[] = {"ID", "Name", "Branch"};
		
		String info[][] = {
				{"21IT404", "Jagdish", "IT"},
				{"21CP010", "Vraj", "CP"},
				{"21ME202", "Meet", "ME"}
		};
		table = new JTable(info, cols);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"21IT404", "Jagdish", "IT"},
				{"21CP010", "Vraj", "CP"},
				{"21ME202", "Meet", "ME"},
			},
			new String[] {
				"ID", "Name", "Branch"
			}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setCellSelectionEnabled(true);
		table.setBounds(0, 0, 300, 239);
		contentPane.add(table);
	};
}
