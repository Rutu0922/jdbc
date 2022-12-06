package com.jsp.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DemoSave {
public static void main(String []args) throws SQLException
{
String url="jdbc:mysql://localhost:3306/javabatch";
String username= "root";
String password = "root";

String sql= "INSERT INTO product VALUES(10,'RAYMOND','SHIRT')";
Connection connection=null;

try {
	//TO LOAD/REGISTER THE DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
	//to establish Connection
	connection=DriverManager.getConnection(url,username,password);
	//create statement
	Statement statement=connection.createStatement();
	//execute the statement
	statement.execute(sql);
	System.out.println("ALL GOOD");
}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}

finally {
	//close the connection
	connection.close();
	
}
}
}

