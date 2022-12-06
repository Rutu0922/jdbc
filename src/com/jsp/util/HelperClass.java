package com.jsp.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class HelperClass {
	
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username= "root";
	String password = "root";
	
	public Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
}
