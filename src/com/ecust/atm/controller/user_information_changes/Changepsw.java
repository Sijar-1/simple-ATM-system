package com.ecust.atm.controller.user_information_changes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.ecust.atm.view.login.*;
import com.ecust.atm.view.user_information_changes.*;
public class Changepsw {
		String url="jdbc:mysql://localhost/atm_user_information?useUnicode=true&characterEncoding=UTF-8";  
		public Changepsw() {
			
			 try{
		            Class.forName("com.mysql.jdbc.Driver");		 
		        }catch(ClassNotFoundException e1){
		            System.out.println("没有成功加载mysql驱动!");
		            e1.printStackTrace();
		        }     
	        try {       	
	            Connection conn = DriverManager.getConnection(url, "root","");			       
	            String sql= "update information set  id=?,password=? where id="+登录界面.peopleid ; 
	            PreparedStatement pstmt =(PreparedStatement) conn.prepareStatement(sql); 
	            pstmt.setString(1, 登录界面.peopleid);
	            pstmt.setString(2, Change_password.newpsw);
	            pstmt.executeUpdate();
	            pstmt.close();
	            conn.close();
	        } catch (SQLException e){
	            e.printStackTrace();
	        }
	       
		}
		
		
}

