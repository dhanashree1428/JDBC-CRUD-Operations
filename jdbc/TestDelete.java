package com.jsp.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		Connection connection =null;
		String sql=("DELETE FROM student WHERE ID=2");

		//STEP-1: load/register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//Step-2: Establish connection
		 connection=DriverManager.getConnection(url, username, password);
		//Step-3:Establish statement
			Statement statement=connection.createStatement();
			
		//step-4:execute the statement
		 statement.execute(sql);
		//step-5:close connection

		}
		catch (ClassNotFoundException e) {
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
