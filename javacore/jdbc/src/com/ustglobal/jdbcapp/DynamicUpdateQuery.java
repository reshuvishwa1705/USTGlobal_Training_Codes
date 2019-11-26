package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;



public class DynamicUpdateQuery {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	FileReader reader = null;
	try {
		reader = new FileReader("db.properties");
		Properties prop = new Properties();
		prop.load(reader);
		//Step 1 load the driver
		Class.forName(prop.getProperty("driver-class-name"));
		String url = prop.getProperty("url");
		//Step 2 get the connection
		conn = DriverManager.getConnection(url, prop);
		pstmt = conn.prepareStatement(prop.getProperty("update-query"));
		String name = args[0];
		pstmt.setString(1, name);
		String empid = args[1];
		int id = Integer.parseInt(empid);
		pstmt.setInt(2, id);
		int count = pstmt.executeUpdate();
		System.out.println(count+ " Rows Updated");
	} catch (Exception e) {
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
			if(reader!=null) {
				reader.close();
			}
		
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
}
