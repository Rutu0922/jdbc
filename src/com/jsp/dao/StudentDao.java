package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class StudentDao {
  
	HelperClass helperClass=new HelperClass();
	public void saveStudent(Student student) {
		String sql="INSERT INTO student values(?,?,?,?,?)";
		Connection connection=helperClass.getConnection();
		 try {
			 PreparedStatement preparedStatement=connection.prepareStatement(sql);
			 preparedStatement.setInt(1, student.getId());
			 preparedStatement.setString(2, student.getName());
			 preparedStatement.setString(3, student.getEmail());
			 preparedStatement.setString(4, student.getGender());
			 preparedStatement.setLong(5, student.getPhoneno());
			 
			 preparedStatement.execute();
			 System.out.println("all good");
			 
			 if(connection!=null) {
				 connection.close();
			 }}
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 
	}
}
