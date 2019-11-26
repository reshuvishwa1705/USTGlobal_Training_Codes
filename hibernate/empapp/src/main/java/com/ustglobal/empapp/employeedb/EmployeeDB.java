package com.ustglobal.empapp.employeedb;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeDB {

	private static Connection conn = null;
	private static String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=reshu";
	public static Connection getDbConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
