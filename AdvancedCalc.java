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

public class AdvancedCalc extends JFrame {

	/**
	 * Launch the application.
	 */
	String tmp = "";
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1, 0, 432, 52);
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
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "7";
				textArea.setText(tmp);
			}
		});
		btnNewButton_5.setBounds(1, 52, 108, 52);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "8";
				textArea.setText(tmp);
			}
		});
		btnNewButton_7.setBounds(109, 52, 108, 52);
		getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "9";
				textArea.setText(tmp);
			}
		});
		btnNewButton.setBounds(217, 52, 108, 52);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.setBounds(325, 52, 108, 52);
		getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "4";
				textArea.setText(tmp);
			}
		});
		btnNewButton_4.setBounds(1, 104, 108, 52);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_11 = new JButton("5");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "5";
				textArea.setText(tmp);
			}
		});
		btnNewButton_11.setBounds(109, 104, 108, 52);
		getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "6";
				textArea.setText(tmp);
			}
		});
		btnNewButton_6.setBounds(217, 104, 108, 52);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setBounds(325, 104, 108, 52);
		getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "1";
				textArea.setText(tmp);
			}
		});
		btnNewButton_10.setBounds(1, 156, 108, 52);
		getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("2");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "2";
				textArea.setText(tmp);
			}
		});
		btnNewButton_12.setBounds(109, 156, 108, 52);
		getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "3";
				textArea.setText(tmp);
			}
		});
		btnNewButton_13.setBounds(217, 156, 108, 52);
		getContentPane().add(btnNewButton_13);
		
		JButton button = new JButton("*");
		button.setBounds(325, 156, 108, 52);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(1, 208, 108, 52);
		getContentPane().add(button_1);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp = tmp + "0";
				textArea.setText(tmp);
			}
		});
		btnNewButton_1.setBounds(109, 208, 108, 52);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.setBounds(217, 208, 108, 52);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBounds(325, 208, 108, 52);
		getContentPane().add(btnNewButton_3);
	}

}
