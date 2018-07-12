package com.ecust.atm.controller.query_function;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ecust.atm.view.login.*;
public class Querybalance {

			String url="jdbc:mysql://localhost/atm_user_information";       
			public static int  balance;
			public static String name;
			public Querybalance() {	   		
				 try{			           
			            Class.forName("com.mysql.jdbc.Driver");		 
			        }catch(ClassNotFoundException e1){
			            System.out.println("mysql加载不成功!");
			            e1.printStackTrace();
			        }     
		        try {       	
		            Connection conn = DriverManager.getConnection(url, "root","");
		            String sql1= "select * from information";
		            Statement stmt=conn.createStatement();
		            ResultSet rs=stmt.executeQuery(sql1);	           
		            while(rs.next()) {
		            	if(rs.getString("id").equals(登录界面.peopleid)) {
		            		balance=rs.getInt("account_balance");
		            		name=rs.getString("name");
		                }	            	    	
		            }
		            stmt.close();
		            conn.close();
		        } catch (SQLException e){
		            e.printStackTrace();
		        }
		       
			}
}
