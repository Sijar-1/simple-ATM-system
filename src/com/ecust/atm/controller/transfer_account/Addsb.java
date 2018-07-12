package com.ecust.atm.controller.transfer_account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Addsb {
        	String url="jdbc:mysql://localhost/atm_user_information";  
			public static int  sbaddbalance;
			public Addsb(String peopleid,int add) {	   
				
				 try{
			            Class.forName("com.mysql.jdbc.Driver");		 
			        }catch(ClassNotFoundException e1){
			            System.out.println("mysql未成功加载驱动!");
			            e1.printStackTrace();
			        }     
		        try {       	
		            Connection conn = DriverManager.getConnection(url, "root","");
		            String sql1= "select * from information";
		            Statement stmt=conn.createStatement();
		            ResultSet rs=stmt.executeQuery(sql1);	           
		            while(rs.next()) {
		            	if(rs.getString("id").equals(peopleid)) {
		            		sbaddbalance=rs.getInt("account_balance")+add;
		                }	            	    	
		            }
		            stmt.close();
		            String sql= "update information set  id=?,account_balance=? where id="+peopleid ; 
		            PreparedStatement pstmt =(PreparedStatement) conn.prepareStatement(sql); 
		            pstmt.setString(1, peopleid);
		            pstmt.setInt(2, sbaddbalance);
		            pstmt.executeUpdate();
		            pstmt.close();
		            conn.close();
		        } catch (SQLException e){
		            e.printStackTrace();
		        }
		       
			}

}
