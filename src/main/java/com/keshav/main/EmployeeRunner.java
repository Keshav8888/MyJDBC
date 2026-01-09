package com.keshav.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {

//		Persistent Object
//		Employee ravi=new Employee(8,"Ravi Gupta","Male",40000);
		
		Employee ravi=new Employee(10,"Rahul","Male",95000);
		
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
//		Statement statement=connection.createStatement();
		
//		statement.executeUpdate("insert into employee(id,name,gender,salary)values("+ravi.getId()+",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");

		DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root").createStatement().executeUpdate("insert into employee(id,name,gender,salary)values("+ravi.getId()+",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		
//		statement.executeUpdate("insert into employee(id,name,gender,salary)values(7,'Vinod','Male',45000);");
		
		
		System.out.println("insert into employee(id,name,gender,salary)values("+ravi.getId()+",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		System.out.println("Query Executed...");
	}

}
