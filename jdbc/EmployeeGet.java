package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeGet {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		String sql="SELECT * FROM employee WHERE ID=5";
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		connection=DriverManager.getConnection(url, username, password);
		
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery(sql);
		
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			
			System.out.println("=================");
		}
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					connection.close();
					System.out.println("ALL GOOD");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

}
