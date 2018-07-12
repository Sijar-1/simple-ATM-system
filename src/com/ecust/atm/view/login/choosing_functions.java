package com.ecust.atm.view.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.ecust.atm.controller.query_function.*;
import com.ecust.atm.view.deposit.Deposit;
import com.ecust.atm.view.query_function.Query_function;
import com.ecust.atm.view.transfer_account.Account_number;
import com.ecust.atm.view.user_information_changes.User_information_changes;
import com.ecust.atm.view.withdraw_money.Withdraw_money;

public class choosing_functions extends JFrame {
	private final JLabel lblSijarBank = new JLabel("Sijar Bank");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choosing_functions frame = new choosing_functions();
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
	public choosing_functions() {
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
		
		Button button = new Button("Transfer");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Account_number().setVisible(true);
				choosing_functions.this.dispose();
			}

			
		});
		button.setBounds(25, 345, 126, 54);
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("����", Font.BOLD, 20));
		button.setBackground(new Color(0, 51, 102));
		getContentPane().add(button);
		
		Button button_1 = new Button("Deposit");
		button_1.setActionCommand("Deposit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Deposit().setVisible(true);
				choosing_functions.this.dispose();

			}
		});
		button_1.setBounds(25, 149, 126, 54);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("����", Font.BOLD, 20));
		button_1.setBackground(new Color(0, 51, 102));
		getContentPane().add(button_1);
		
		Button button_2 = new Button("Withdraw");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Withdraw_money().setVisible(true);
				choosing_functions.this.dispose();

			}
		});
		button_2.setBounds(25, 247, 126, 54);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("����", Font.BOLD, 20));
		button_2.setBackground(new Color(0, 51, 102));
		getContentPane().add(button_2);
		
		Button Query = new Button("Query");
		Query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Querybalance qyb =new Querybalance();
				new Query_function().setVisible(true);
				choosing_functions.this.dispose();
			}
		});
		Query.setBounds(735, 162, 126, 54);
		Query.setForeground(Color.WHITE);
		Query.setFont(new Font("����", Font.BOLD, 20));
		Query.setBackground(new Color(0, 51, 102));
		getContentPane().add(Query);
		
		Button Goback = new Button("Quit");
		Goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Goback.setBounds(735, 357, 126, 54);
		Goback.setForeground(Color.WHITE);
		Goback.setFont(new Font("����", Font.BOLD, 20));
		Goback.setBackground(new Color(0, 51, 102));
		getContentPane().add(Goback);
		
		Button Change = new Button("Change");
		Change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new User_information_changes().setVisible(true);
				choosing_functions.this.dispose();
			}
		});
		Change.setBounds(735, 260, 126, 54);
		Change.setForeground(Color.WHITE);
		Change.setFont(new Font("����", Font.BOLD, 20));
		Change.setBackground(new Color(0, 51, 102));
		getContentPane().add(Change);
		
		JLabel label = new JLabel("\u60A8\u597D\uFF01\u8BF7\u9009\u62E9\u60A8\u9700\u8981\u7684\u670D\u52A1\uFF01");
		label.setFont(new Font("����", Font.PLAIN, 26));
		label.setForeground(Color.WHITE);
		label.setBounds(237, 149, 361, 54);
		getContentPane().add(label);
	}
}
