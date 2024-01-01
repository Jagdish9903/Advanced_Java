import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.ComponentOrientation;

public class AdvancedCalc extends JFrame {

	/**
	 * Launch the application.
	 */
	String tmp = "";
	int a, b;
	char c;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvancedCalc frame = new AdvancedCalc();
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
	public AdvancedCalc() {
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 16));
		getContentPane().setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(1, 0, 275, 52);
		textArea.setWrapStyleWord(true);
		textArea.setColumns(1);
		textArea.setTabSize(16);
		getContentPane().add(textArea);
		
		JLabel label = new JLabel("");
		label.setBounds(109, 0, 108, 52);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(217, 0, 108, 52);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(325, 0, 108, 52);
		getContentPane().add(label_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setTabSize(20);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setDisabledTextColor(new Color(109, 109, 109));
		textArea_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textArea_1.setSelectedTextColor(Color.WHITE);
		textArea_1.setSelectionColor(Color.BLACK);
		textArea_1.setForeground(Color.BLACK);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(275, 0, 160, 52);
		getContentPane().add(textArea_1);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "7";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_5.setBounds(1, 52, 108, 52);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "8";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_7.setBounds(109, 52, 108, 52);
		getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "9";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton.setBounds(217, 52, 108, 52);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_8.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(textArea.getText());
				c = '+';
				textArea_1.setText(textArea.getText());
				tmp = "";
				textArea.setText(tmp);
			}
		});
		btnNewButton_8.setBounds(325, 52, 108, 52);
		getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setToolTipText("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "4";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_4.setBounds(1, 104, 108, 52);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_11 = new JButton("5");
		btnNewButton_11.setForeground(Color.WHITE);
		btnNewButton_11.setBackground(Color.DARK_GRAY);
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "5";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_11.setBounds(109, 104, 108, 52);
		getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBackground(Color.DARK_GRAY);
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "6";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_6.setBounds(217, 104, 108, 52);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_9.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(textArea.getText());
				c = '-';
				textArea_1.setText(textArea.getText());
				tmp = "";
				textArea.setText(tmp);
			}
		});
		btnNewButton_9.setBounds(325, 104, 108, 52);
		getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.setForeground(Color.WHITE);
		btnNewButton_10.setBackground(Color.DARK_GRAY);
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "1";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_10.setBounds(1, 156, 108, 52);
		getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("2");
		btnNewButton_12.setBackground(Color.DARK_GRAY);
		btnNewButton_12.setForeground(Color.WHITE);
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "2";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_12.setBounds(109, 156, 108, 52);
		getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.setForeground(Color.WHITE);
		btnNewButton_13.setBackground(Color.DARK_GRAY);
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "3";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_13.setBounds(217, 156, 108, 52);
		getContentPane().add(btnNewButton_13);
		
		JButton button = new JButton("*");
		button.setForeground(Color.WHITE);
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("Arial Black", Font.BOLD, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(textArea.getText());
				c = '*';
				textArea_1.setText(textArea.getText());
				tmp = "";
				textArea.setText(tmp);
			}
		});
		button.setBounds(325, 156, 108, 52);
		getContentPane().add(button);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp.substring(0, tmp.length() - 1);
				textArea.setText(tmp);
			}
		});
		btnDel.setBackground(Color.LIGHT_GRAY);
		btnDel.setForeground(Color.WHITE);
		btnDel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDel.setBounds(1, 208, 108, 52);
		getContentPane().add(btnDel);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "0";
				textArea.setText(tmp);
				//textArea_1.setText("" + a);
			}
		});
		btnNewButton_1.setBounds(109, 208, 108, 52);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = Integer.parseInt(tmp);
				if(c == '+')
				{
					a = a + b;
				}
				else if(c == '-')
				{
					a = a - b;
				}
				else if(c == '*')
				{
					a = a * b;
				}
				else if(c == '/')
				{
					a = a / b;
				}
				textArea.setText(a + "");
				tmp = textArea.getText();
				textArea_1.setText(" = " + a);
			}
		});
		btnNewButton_2.setBounds(217, 208, 108, 52);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(textArea.getText());
				c = '/';
				textArea_1.setText(textArea.getText());
				tmp = "";
				textArea.setText(tmp);
			}
		});
		btnNewButton_3.setBounds(325, 208, 108, 52);
		getContentPane().add(btnNewButton_3);
		
	}
}
