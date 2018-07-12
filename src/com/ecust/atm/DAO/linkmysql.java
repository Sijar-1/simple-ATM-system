package com.ecust.atm.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class linkmysql {
	String url="jdbc:mysql://localhost/atm_user_information";    //JDBC��URL    
    
    //����DriverManager�����getConnection()���������һ��Connection����
	public linkmysql() {		
        try{
            //����Class.forName()����������������
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e1){
            System.out.println("mysql加载不成功!");
            e1.printStackTrace();
        }     
        try {
            Connection conn = DriverManager.getConnection(url, "root","");
            //����һ��Statement����
            Statement stmt = conn.createStatement(); //����Statement����         
            String sql= "select * from information"; //Ҫִ�е�SQL       
           ResultSet rs=stmt.executeQuery(sql); //�������ݶ���
            stmt.close();
            conn.close();    
        } catch (SQLException e){
            e.printStackTrace();
        }       
	}
	
	public boolean check(String id,String password)//��½��֤
	{
		String sql="select* from information where id='"+id+"' and password='"+password+"'";
		try {
			String url="jdbc:mysql://localhost/atm_user_information"; 
			Connection conn = DriverManager.getConnection(url, "root","");	      
	       Statement  stmt = conn.createStatement(); 
	        ResultSet rs=stmt.executeQuery(sql);
			if(rs.next())
			{
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
