package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;
 
public class RegisterDao { 
     public String registerUser(RegisterBean registerBean)
     {
         String fullName = registerBean.getFullName();
         String email = registerBean.getEmail();
         String userName = registerBean.getUserName();
         String password = registerBean.getPassword();
          
         Connection con = null;
         PreparedStatement preparedStatement = null;         
         try
         {
        	 con = DBConnection.createConnection();
             String query = "insert into users(Slno,fullname,Email,username,password) values (?,?,?,?,?)"; //Insert user into the table
             preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
             preparedStatement.setString(1, fullName);
             preparedStatement.setString(2, email);
             preparedStatement.setString(3, userName);
             preparedStatement.setString(4, password);
              
             int i= preparedStatement.executeUpdate();
             con.close();
              
             if (i!=0)  
             return "SUCCESS"; 
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }       
         return "Oops.. Something went wrong there..!";  
     }
}