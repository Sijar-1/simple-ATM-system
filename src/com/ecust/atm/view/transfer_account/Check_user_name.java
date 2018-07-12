package com.ecust.atm.view.transfer_account;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ecust.atm.controller.transfer_account.account_name;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Check_user_name extends JFrame {
	private final JLabel lblSijarBank = new JLabel("Sijar Bank");
	private JTextField textField;
	private JTextField textshow;
	private Button makesure;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_user_name frame = new Check_user_name();
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
	public Check_user_name() {
		getContentPane().setEnabled(false);
		getContentPane().setFocusTraversalKeysEnabled(false);
		getContentPane().setFocusable(false);
		getContentPane().setBounds(new Rectangle(20, 20, 20, 20));
		getContentPane().setBackground(new Color(95, 158, 160));
		getContentPane().setForeground(new Color(0, 0, 0));
		setSize(new Dimension(900, 600));
		getContentPane().setLayout(null);
		lblSijarBank.setBounds(361, 0, 188, 76);
		lblSijarBank.setFont(new Font("����", Font.BOLD, 30));
		getContentPane().add(lblSijarBank);
		
		Button goback = new Button("Return");
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Account_number().setVisible(true);
				Check_user_name.this.dispose();
			}
		});
		goback.setBounds(735, 357, 126, 54);
		goback.setForeground(Color.WHITE);
		goback.setFont(new Font("����", Font.BOLD, 20));
		goback.setBackground(new Color(0, 51, 102));
		getContentPane().add(goback);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(0, 139, 139));
		textField.setFont(new Font("����", Font.PLAIN, 26));
		textField.setForeground(Color.WHITE);
		textField.setText("\u8BE5\u7528\u6237\u7528\u6237\u540D\u662F");
		textField.setBounds(230, 127, 335, 76);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textshow = new JTextField();
		textshow.setEditable(false);
		textshow.setText(account_name.namefromid);
		textshow.setForeground(Color.WHITE);
		textshow.setFont(new Font("����", Font.PLAIN, 26));
		textshow.setColumns(10);
		textshow.setBackground(new Color(0, 139, 139));
		textshow.setBounds(230, 258, 335, 220);
		getContentPane().add(textshow);
		
		makesure = new Button("Confirm");
		makesure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Transfer_account().setVisible(true);
				Check_user_name.this.dispose();
			}
		});
		makesure.setForeground(Color.WHITE);
		makesure.setFont(new Font("����", Font.BOLD, 20));
		makesure.setBackground(new Color(0, 51, 102));
		makesure.setBounds(26, 314, 126, 54);
		getContentPane().add(makesure);
	}
}
