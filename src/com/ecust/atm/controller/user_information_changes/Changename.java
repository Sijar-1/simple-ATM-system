package com.ecust.atm.controller.user_information_changes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ecust.atm.view.login.登录界面;
import com.ecust.atm.view.user_information_changes.Change_user_name;
public class Changename {
				String url="jdbc:mysql://localhost/atm_user_information?useUnicode=true&characterEncoding=UTF-8";        
				public  Changename() {	   
					
					 try{
				            Class.forName("com.mysql.jdbc.Driver");		 
				        }catch(ClassNotFoundException e1){
				            System.out.println("mysql加载不成功!");
				            e1.printStackTrace();
				        }     
			        try {       	
			            Connection conn = DriverManager.getConnection(url, "root","");			       
			            String sql= "update information set  id=?,name=? where id="+登录界面.peopleid ;
			            PreparedStatement pstmt =(PreparedStatement) conn.prepareStatement(sql); 
			            pstmt.setString(1, 登录界面.peopleid);
			            pstmt.setString(2, Change_user_name.newname);
			            pstmt.executeUpdate();
			            pstmt.close();
			            conn.close();
			        } catch (SQLException e){
			            e.printStackTrace();
			        }			       
				}		
}
