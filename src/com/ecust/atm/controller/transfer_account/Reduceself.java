package com.ecust.atm.controller.transfer_account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ecust.atm.controller.withdraw_money.*;

public class Reduceself {
	           public static int Notenough=0;
				String url="jdbc:mysql://localhost/atm_user_information";  
				public Reduceself(String peopleid,int reduce) {	   		
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
			            	if(rs.getString("id").equals(peopleid)) {
			            		if(rs.getInt("account_balance")<reduce) {	
			            			Reducemoney.reducebalance=rs.getInt("account_balance");
			            			Notenough=1;
			            		}
			            		else {
			            			Notenough=0;
			            			Reducemoney.reducebalance=rs.getInt("account_balance")-reduce;			            			
			            		}
			                }	            	    	
			            }
			            stmt.close();
			            String sql= "update information set  id=?,account_balance=? where id="+peopleid ; 
			            PreparedStatement pstmt =(PreparedStatement) conn.prepareStatement(sql);      
			            pstmt.setString(1, peopleid);
			            pstmt.setInt(2, Reducemoney.reducebalance);
			            pstmt.executeUpdate();
			            pstmt.close();
			            conn.close();
			        } catch (SQLException e){
			            e.printStackTrace();
			        }
			       
				}

}
