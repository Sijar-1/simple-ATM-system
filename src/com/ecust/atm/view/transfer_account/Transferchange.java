package com.ecust.atm.view.transfer_account;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ecust.atm.view.login.*;
import com.ecust.atm.view.withdraw_money.*;
import com.ecust.atm.controller.deposit.*;
import com.ecust.atm.controller.withdraw_money.*;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transferchange extends JFrame {
	private final JLabel lblSijarBank = new JLabel("Sijar Bank");
	private JTextField textField;
	private JTextField textBalance;
	private JTextField textChange;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transferchange frame = new Transferchange();
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
	public Transferchange() {
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
				Transferchange.this.dispose();
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
		textField.setText("\u60A8\u5F53\u524D\u7684\u8D26\u6237\u4F59\u989D\u4E3A");
		textField.setBounds(215, 314, 335, 76);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textBalance = new JTextField();
		textBalance.setEditable(false);

		String b=Integer.toString(Reducemoney.reducebalance);
		textBalance.setText(b);
		
		textBalance.setForeground(Color.WHITE);
		textBalance.setFont(new Font("����", Font.PLAIN, 26));
		textBalance.setColumns(10);
		textBalance.setBackground(new Color(0, 139, 139));
		textBalance.setBounds(215, 401, 334, 85);
		getContentPane().add(textBalance);
		
		textChange = new JTextField();
		textChange.setEditable(false);
		System.out.println(Withdraw_money.reduce);
		String a=Integer.toString(Withdraw_money.reduce);
		textChange.setText(a);
		
		textChange.setForeground(Color.WHITE);
		textChange.setFont(new Font("����", Font.PLAIN, 26));
		textChange.setColumns(10);
		textChange.setBackground(new Color(0, 139, 139));
		textChange.setBounds(215, 199, 334, 94);
		getContentPane().add(textChange);
		
		textField_3 = new JTextField();
		textField_3.setText("\u6B64\u6B21\u4EA4\u6613\u6539\u53D8\u91D1\u989D");
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("����", Font.PLAIN, 26));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(0, 139, 139));
		textField_3.setBounds(214, 113, 335, 76);
		getContentPane().add(textField_3);
	}
}


