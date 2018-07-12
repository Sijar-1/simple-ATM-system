package com.ecust.atm.controller.deposit;
import java.sql.*;

public class addmoney {
		String url="jdbc:mysql://localhost/atm_user_information";    
		public static int  addbalance;
		public addmoney(String peopleid,int add) {	   
			
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
	            		addbalance=rs.getInt("account_balance")+add;
	                }	            	    	
	            }
	            stmt.close();
	            String sql= "update information set  id=?,account_balance=? where id="+peopleid ; //Ҫִ�е�SQL
	            PreparedStatement pstmt =(PreparedStatement) conn.prepareStatement(sql);     
	            pstmt.setString(1, peopleid);
	            pstmt.setInt(2, addbalance);
	            pstmt.executeUpdate();
	            pstmt.close();
	            conn.close();
	        } catch (SQLException e){
	            e.printStackTrace();
	        }
	       
		}

}
