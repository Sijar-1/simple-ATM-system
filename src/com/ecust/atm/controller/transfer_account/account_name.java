package com.ecust.atm.controller.transfer_account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.ecust.atm.view.login.*;
import com.ecust.atm.view.transfer_account.*;

public class account_name {		
		String url="jdbc:mysql://localhost/atm_user_information";   
	    public static String namefromid;
	    public static int Notfound;
		public account_name() {
			
	        try{	         
	            Class.forName("com.mysql.jdbc.Driver");
	        }catch(ClassNotFoundException e1){
	            System.out.println("mysql加载不成功!");
	            e1.printStackTrace();
	        }     
	        try {
	            Connection conn = DriverManager.getConnection(url, "root","");
	            Statement stmt = conn.createStatement(); 	     
	            String sql= "select * from information"; 
	           ResultSet rs=stmt.executeQuery(sql); 
	           Notfound=1;
	           while(rs.next()) {        	   
	        	   if(rs.getString("id").equals(Account_number.sbaccount)) {
	                  String a=rs.getString("id");
	                  namefromid=rs.getString("name");
	                  Notfound=0;	   
	        	   }
	           }
	            stmt.close();
	            conn.close();
	        	
	        
	        } catch (SQLException e){
	            e.printStackTrace();
	        }
	       
		}
		
		
}
