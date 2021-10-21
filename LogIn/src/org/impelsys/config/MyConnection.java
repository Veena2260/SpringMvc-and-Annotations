package org.impelsys.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	static Connection con;
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return con;
	}

}