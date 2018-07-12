package com.ecust.atm.view.deposit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ecust.atm.DAO.linkmysql;
import com.ecust.atm.view.login.*;
import com.ecust.atm.view.query_function.*;
import com.ecust.atm.controller.deposit.*;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposit extends JFrame {
	private final JLabel lblSijarBank = new JLabel("Sijar Bank");
	private JTextField textField;
	private JTextField textDeposit;
	public static int add;
	public  String pid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit();
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
	public Deposit() {
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
		
		Button button_4 = new Button("Return");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new choosing_functions().setVisible(true);
				Deposit.this.dispose();
			}
		});
		button_4.setBounds(735, 357, 126, 54);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("����", Font.BOLD, 20));
		button_4.setBackground(new Color(0, 51, 102));
		getContentPane().add(button_4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(0, 139, 139));
		textField.setFont(new Font("����", Font.PLAIN, 26));
		textField.setForeground(Color.WHITE);
		textField.setText("\u8BF7\u8F93\u5165\u5B58\u6B3E\u91D1\u989D");
		textField.setBounds(230, 127, 335, 76);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		Button button_6 = new Button("Confirm");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textDeposit.getText().equals("")) {
					 JOptionPane.showMessageDialog(null, "输入不能为空！");
				}else {
				 登录界面 login=new 登录界面();
				 pid=login.peopleid;
				 add=Integer.parseInt(textDeposit.getText());
				 addmoney addm=new addmoney(pid, add);
					  new Depositchange().setVisible(true);
						Deposit.this.dispose();
				}		
			}
		});
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("����", Font.BOLD, 20));
		button_6.setBackground(new Color(0, 51, 102));
		button_6.setBounds(25, 439, 126, 54);
		getContentPane().add(button_6);
		
		textDeposit = new JTextField();
		textDeposit.setForeground(Color.WHITE);
		textDeposit.setFont(new Font("����", Font.PLAIN, 26));
		textDeposit.setColumns(10);
		textDeposit.setBackground(new Color(0, 139, 139));
		textDeposit.setBounds(230, 258, 335, 220);
		getContentPane().add(textDeposit);
	}
}

