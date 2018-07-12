package com.ecust.atm.view.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Point;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.ecust.atm.DAO.*;

public class 登录界面 extends JFrame {
	public static String peopleid;
	private JTextField textField;
	public static int number=0;
	/**
	 * Launch the application.
	 */
	public static ResultSet rst=null;
	private JPasswordField psw;
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					登录界面 frame = new 登录界面();
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
	public 登录界面() {
		getContentPane().setBackground(new Color(102, 153, 153));
		setSize(new Dimension(900, 600));
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setTitle("Sijar Bank");
		getContentPane().setLayout(null);
		
		JLabel lblWelcomeToSijar = new JLabel("Welcome to Sijar Bank!");
		lblWelcomeToSijar.setBounds(45, 45, 707, 145);
		lblWelcomeToSijar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblWelcomeToSijar.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblWelcomeToSijar.setFont(new Font("����", Font.PLAIN, 54));
		lblWelcomeToSijar.setBackground(new Color(0, 102, 102));
		getContentPane().add(lblWelcomeToSijar);
		
		
		
		textField = new JTextField();
		textField.setBounds(170, 200, 175, 42);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u60A8\u7684\u5361\u53F7");
		label.setBounds(50, 204, 110, 32);
		label.setFont(new Font("����", Font.PLAIN, 14));
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u60A8\u7684\u5BC6\u7801");
		label_1.setBounds(50, 286, 122, 32);
		label_1.setFont(new Font("����", Font.PLAIN, 14));
		getContentPane().add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(392, 209, 419, 220);
		getContentPane().add(scrollPane);
		
		JTextArea txtrAtm = new JTextArea();
		scrollPane.setViewportView(txtrAtm);
		txtrAtm.setEditable(false);
		txtrAtm.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrAtm.setToolTipText("");
		txtrAtm.setText("\u206A                                                         \u6E29\u99A8\u63D0\u793A\r\n     ATM\u4EA4\u6613\u5B89\u5168\u63D0\u793A\r\n     \u4E3A\u4E86\u4FDD\u969C\u60A8\u7684\u8D44\u91D1\u5B89\u5168\uFF0C\u5C31\u4F7F\u7528ATM\u673A\u8FDB\u884C\u7684\u4EA4\u6613\uFF0C\u5728\u4EA4\u6613\u524D\u8BF7\u6CE8\u610F\u4EE5\u4E0B\u4E8B\u9879\uFF1A\r\n     1.\u8BF7\u60A8\u52A1\u5FC5\u6839\u636EATM\u673A\u5668\u754C\u9762\u7684\u63D0\u793A\u64CD\u4F5C\uFF0C\u4EFB\u4F55ATM\u673A\u4E4B\u5916\u7684\u63D0\u793A\u5747\u975E\u672C\u884C\u884C\u4E3A\u3002\r\n     2.\u4EA4\u6613\u524D\u8BF7Confirm\u63D2\u5361\u69FD\u548C\u5BC6\u7801\u952E\u76D8\u662F\u5426\u6709\u5B89\u88C5\u5F02\u5E38\u88C5\u7F6E\u7B49\u60C5\u51B5\u3002\r\n     3.\u8F93\u5165\u5BC6\u7801\u65F6\uFF0C\u8BF7\u7528\u624B\u548C\u8EAB\u4F53\u906E\u6321\u64CD\u4F5C\u624B\u52BF\uFF0C\u4EE5\u9632\u4E0D\u6CD5\u5206\u5B50\u7AA5\u89C6\u3002\r\n     4.\u5982\u60A8\u5728\u4EA4\u6613\u8FC7\u7A0B\u4E2D\u53D1\u751F\u541E\u5361\u6216\u4E0D\u5410\u949E\u7B49\u5F02\u5E38\u73B0\u8C61\uFF0C\u8BF7\u60A8\u4E0D\u8981\u79BB\u5F00\uFF0C\u7ACB\u523B\u62E8\u6253\u6211\u884C24\u5C0F\u65F6\u5BA2\u6237\u670D\u52A1\u70ED\u7EBF\uFF1A23333\r\n     Safety Tips For ATM Transaction\r\n     For the safety of your funds, please pay attention to the followings before conducting transaction by ATM:\r\n     1. Please operate under the guidance of ATM. Do not follow any hints outside the ATM.\r\n      2. Please make sure there are no abnormal devices around card slot or PIN pad before your transaction.\r\n      3. Please pay attention to preventing others from peeping at your password when you enter it.\r\n      4. If your card is swallowed by the ATM or your transsaction fails, please do not leave and call our customer service hotline 23333 immediately.");
	
		
		Button login = new Button("Login");
		login.setBounds(143, 376, 188, 53);
		login.setMaximumSize(new Dimension(40, 50));
		login.setBackground(new Color(0, 102, 102));
		login.setForeground(new Color(255, 255, 255));
		login.setFont(new Font("Dialog", Font.PLAIN, 28));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  linkmysql link1=new linkmysql();
			  String s=String.valueOf(psw.getPassword());
			  if(number>=3) {
				  JOptionPane.showMessageDialog(null, "您已三次输错!登录不可用"); 
				  login.setEnabled(false);
			  }else {
			  if(textField.getText().equals("")||String.valueOf(psw.getPassword()).equals("")) {
				  JOptionPane.showMessageDialog(null, "用户密码不能为空！"); 
				  textField.setText("");
				  psw.setText("");
			  }else {
			  if(link1.check(textField.getText(),s)) {
				  String s1=textField.getText();
				  peopleid=s1;
				  number=0;
				  new choosing_functions().setVisible(true);
					登录界面.this.dispose();
			  }
			  else {
				  JOptionPane.showMessageDialog(null, "用户密码错误，请重新输入");
				  textField.setText("");
				  psw.setText("");		
				  number++;
			  }		
			  }
			  }
			}
		});
		getContentPane().add(login);
		
		psw = new JPasswordField();
		psw.setBounds(170, 286, 175, 32);
		getContentPane().add(psw);
	}				 	      	   
}




  
   
