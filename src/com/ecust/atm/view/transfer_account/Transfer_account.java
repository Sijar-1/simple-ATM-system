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
import com.ecust.atm.view.withdraw_money.*;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transfer_account extends JFrame {
	private final JLabel lblSijarBank = new JLabel("Sijar Bank");
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transfer_account frame = new Transfer_account();
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
	public Transfer_account() {
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
				new Check_user_name().setVisible(true);
				Transfer_account.this.dispose();
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
		textField.setText("\u8BF7\u8F93\u5165\u8F6C\u8D26\u91D1\u989D");
		textField.setBounds(230, 127, 335, 76);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		Button makesure = new Button("Confirm");
		makesure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "输入不能为空！"); 
				}else {
				Withdraw_money.reduce=Integer.parseInt(textField_1.getText());
			    String a=登录界面.peopleid;
			    Reduceself rdsf=new Reduceself(a, Withdraw_money.reduce);
			    if(Reduceself.Notenough==1) {
			    	JOptionPane.showMessageDialog(null, "余额不足"); 
			    }else {
			    	Addsb addsb=new Addsb(Account_number.sbaccount,Withdraw_money.reduce);
				new Transferchange().setVisible(true);
				Transfer_account.this.dispose();
			    }
				}
			}
		});
		makesure.setForeground(Color.WHITE);
		makesure.setFont(new Font("����", Font.BOLD, 20));
		makesure.setBackground(new Color(0, 51, 102));
		makesure.setBounds(25, 439, 126, 54);
		getContentPane().add(makesure);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("����", Font.PLAIN, 26));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(0, 139, 139));
		textField_1.setBounds(230, 258, 335, 220);
		getContentPane().add(textField_1);
	}
}
