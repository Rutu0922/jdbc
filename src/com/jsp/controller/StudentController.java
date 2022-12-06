package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;


public class StudentController {
	public static void main(String []args) {
		//TODO auto-generated methods stub
		Student student=new Student ();
		student.setId(1);
		student.setName("kajal");
		student.setGender("female");
		student.setEmail("abc@123");
		student.setPhoneno(98765421);
		
		StudentDao studentdao=new StudentDao();
		studentdao.saveStudent(student);
	}
}
