package com.ecust.atm.view.query_function;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ecust.atm.controller.query_function.Querybalance;
import com.ecust.atm.view.login.choosing_functions;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Query_function extends JFrame {
	private final JLabel lblSijarBank = new JLabel("Sijar Bank");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Query_function frame = new Query_function();
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
	public Query_function() {
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
				Query_function.this.dispose();
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
		textField.setText("\u60A8\u5F53\u524D\u7684\u8D26\u6237\u4F59\u989D\u4E3A");
		textField.setBounds(230, 244, 335, 76);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		String a=Integer.toString(Querybalance.balance);
		textField_1.setText(a);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("����", Font.PLAIN, 26));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(0, 139, 139));
		textField_1.setBounds(230, 344, 335, 76);
		getContentPane().add(textField_1);
		
		name = new JTextField();
		String b=Querybalance.name;
		name.setText(b);
		name.setForeground(Color.WHITE);
		name.setFont(new Font("����", Font.PLAIN, 26));
		name.setEditable(false);
		name.setColumns(10);
		name.setBackground(new Color(0, 139, 139));
		name.setBounds(230, 146, 335, 76);
		getContentPane().add(name);
	}
}
