package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=reshu";
	String sql = "select * from employee where id=?";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		//step 1 load the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//step 2 get the connection
		conn = DriverManager.getConnection(url);
		//step 3 Issue SQL query
		pstmt = conn.prepareStatement(sql);
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1, id);
		rs = pstmt.executeQuery();
		//step 4 read the result
		if(rs.next()) {
			int emp_id = rs.getInt("id");
			String name = rs.getString("name");
			int sal = rs.getInt("sal");
			String gender = rs.getString("gender");
			System.out.println("Id is "+emp_id);
			System.out.println("Name is "+name);
			System.out.println("Salary is "+sal);
			System.out.println("Gender is "+gender);
			System.out.println("------------------");

		}
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
}
