import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcDesign extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcDesign frame = new CalcDesign();
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
	public CalcDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("number 1");
		lblNewLabel.setBounds(45, 34, 59, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("number 2");
		lblNewLabel_1.setBounds(45, 72, 59, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(132, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 72, 86, 20);
		contentPane.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(45, 201, 193, 49);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = textField.getText();
				String b = textField_1.getText();
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				int sum = x + y;
				textArea.setText(x + " + " + y + " = " + sum);
			}
		});
		btnNewButton.setBounds(45, 139, 48, 21);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = textField.getText();
				String b = textField_1.getText();
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				int sum = x - y;
				textArea.setText(x + " - " + y + " = " + sum);
			}
		});
		button.setBounds(103, 139, 48, 21);
		contentPane.add(button);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				String b = textField_1.getText();
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				int sum = x * y;
				textArea.setText(x + " * " + y + " = " + sum);

			}
		});
		button_1.setVerticalAlignment(SwingConstants.BOTTOM);
		button_1.setBounds(161, 139, 48, 21);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				String b = textField_1.getText();
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				double sum = x / (double)y;
				textArea.setText(x + " / " + y + " = " + sum);
			}
		});
		button_2.setBounds(219, 139, 48, 21);
		contentPane.add(button_2);
	}
}
