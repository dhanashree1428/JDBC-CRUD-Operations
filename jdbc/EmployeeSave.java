package com.jsp.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeSave {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		String sql="INSERT INTO employee VALUES(120,'xyz','xyz@mail.com')";

		//STEP-1: load/register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//Step-2: Establish connection
			Connection connection=DriverManager.getConnection(url, username, password);
		//Step-3:Establish statement
			Statement statement=connection.createStatement();
			
		//step-4:execute the statement
		statement.execute(sql);
		//step-5:close connection
		connection.close();
		System.out.println("ALL GOOD");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}

		}

		

	}


