package com.ecust.atm.controller.withdraw_money;

import java.sql.*;

import com.ecust.atm.view.withdraw_money.Withdraw_money;

public class Reducemoney {
			String url="jdbc:mysql://localhost/atm_user_information";   
			public static int  reducebalance;
			public static int insufficient=0;
			public Reducemoney(String peopleid,int reduce) {	   
				
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
		            			reducebalance=rs.getInt("account_balance");		            			
		            			insufficient=1;
		            		}else {		            			
		            			insufficient=0;
		            		reducebalance=rs.getInt("account_balance")-reduce;
		            		}
		                }	            	    	
		            }
		            stmt.close();
		            String sql= "update information set  id=?,account_balance=? where id="+peopleid ; //Ҫִ�е�SQL
		            PreparedStatement pstmt =(PreparedStatement) conn.prepareStatement(sql); 
		            pstmt.setString(1, peopleid);
		            pstmt.setInt(2, reducebalance);
		            pstmt.executeUpdate();
		            pstmt.close();
		            conn.close();
		        } catch (SQLException e){
		            e.printStackTrace();
		        }
		       
			}
}
