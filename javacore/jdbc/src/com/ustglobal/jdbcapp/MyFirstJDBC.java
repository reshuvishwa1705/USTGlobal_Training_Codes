package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//Step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			//Step 2 get the connection
			conn = DriverManager.getConnection(url, "root", "reshu");
			//Step 3 issue SQL query
			String sql = "select * from employee";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			//Step 4 read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				System.out.println("Id is "+id);
				System.out.println("Name is "+name);
				System.out.println("Salary is "+sal);
				System.out.println("Gender is "+gender);
				System.out.println("------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Step 5 close all jdbc object.
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					conn.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//end of main()

}//end of MyFirstJDBC
