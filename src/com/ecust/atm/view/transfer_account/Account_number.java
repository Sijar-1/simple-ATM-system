package com.ecust.atm.view.transfer_account;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ecust.atm.controller.transfer_account.*;
import com.ecust.atm.view.login.*;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Account_number extends JFrame {
	private final JLabel lblSijarBank = new JLabel("Sijar Bank");
	private JTextField textField;
	private JTextField textsbaccount;
    public static String sbaccount;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Account_number frame = new Account_number();
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
	public Account_number() {
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
				new choosing_functions().setVisible(true);
				Account_number.this.dispose();
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
		textField.setText("\u8BF7\u8F93\u5165\u5BF9\u65B9\u8D26\u53F7");
		textField.setBounds(230, 127, 335, 76);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		Button makesure = new Button("Confirm");
		makesure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {								
				if(textsbaccount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "输入不能为空！");
				}else {
				sbaccount=textsbaccount.getText();
				account_name acn=new account_name();
				if(account_name.Notfound==0) {
				new Check_user_name().setVisible(true);
				Account_number.this.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "该用户不存在请重新输入");
					textsbaccount.setText("");
				}
				}
			}
		});
		makesure.setForeground(Color.WHITE);
		makesure.setFont(new Font("����", Font.BOLD, 20));
		makesure.setBackground(new Color(0, 51, 102));
		makesure.setBounds(25, 439, 126, 54);
		getContentPane().add(makesure);
		
		textsbaccount = new JTextField();
		textsbaccount.setForeground(Color.WHITE);
		textsbaccount.setFont(new Font("����", Font.PLAIN, 26));
		textsbaccount.setColumns(10);
		textsbaccount.setBackground(new Color(0, 139, 139));
		textsbaccount.setBounds(230, 258, 335, 220);
		getContentPane().add(textsbaccount);
	}
}
