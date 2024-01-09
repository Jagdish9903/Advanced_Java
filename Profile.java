import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;

import java.awt.Cursor;
import java.awt.Dimension;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.ComponentOrientation;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Profile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * @wbp.nonvisual location=461,149
	 */
	private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
	private JRadioButton r2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 48, 55, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(10, 84, 55, 25);
		contentPane.add(lblEmail);
		
		JLabel lblA = new JLabel("Address");
		lblA.setBounds(10, 120, 55, 25);
		contentPane.add(lblA);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 171, 55, 25);
		contentPane.add(lblGender);
		
		JLabel lblHobbies = new JLabel("Hobbies");
		lblHobbies.setBounds(10, 220, 55, 25);
		contentPane.add(lblHobbies);
		
		textField = new JTextField();
		textField.setBounds(75, 50, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(75, 86, 139, 20);
		contentPane.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(75, 120, 139, 42);
		contentPane.add(textArea);
		ButtonGroup cbg = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(71, 172, 47, 23);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setBounds(141, 172, 80, 23);
		contentPane.add(r2);
		
		cbg.add(r1);
		cbg.add(r2);
		
		JCheckBox c1 = new JCheckBox("Reading");
		c1.setBounds(63, 221, 65, 23);
		contentPane.add(c1);
		
		JCheckBox c2 = new JCheckBox("Writing");
		c2.setBounds(130, 221, 65, 23);
		contentPane.add(c2);
		
		JCheckBox c3 = new JCheckBox("Sports");
		c3.setBounds(197, 221, 65, 23);
		contentPane.add(c3);
		
		JTextArea t = new JTextArea();
		t.setBounds(238, 11, 187, 196);
		contentPane.add(t);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = "Name : " + textField.getText();
				String s1 = "email : " + textField_1.getText();
				String s2 = "Address : " + textArea.getText();
				String gender = "Gender : ";
				if(r1.isSelected())
				{
					gender += r1.getText();
				}
				if(r2.isSelected())
				{
					gender += r2.getText();
				}
				String hobbies = "Hobbies : ";
				if(c1.isSelected())
				{
					hobbies += c1.getText();
				}
				if(c2.isSelected())
				{
					hobbies += c2.getText() + " ";
				}
				if(c3.isSelected())
				{
					hobbies += c3.getText();
				}
				t.setText(s + "\n" + s1 + "\n" + s2 + "\n" + gender + "\n" + hobbies + "\n");
			}
		});
		btnNewButton.setBounds(282, 237, 89, 23);
		contentPane.add(btnNewButton);
	}
}
