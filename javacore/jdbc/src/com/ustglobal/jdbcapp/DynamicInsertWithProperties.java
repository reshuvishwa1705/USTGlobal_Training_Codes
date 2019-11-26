package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DynamicInsertWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//Step 1 load the driver
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			//Step 2 get the connection
			conn = DriverManager.getConnection(url, prop);
			pstmt = conn.prepareStatement(prop.getProperty("insert-query"));
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			String name = args[1];
			pstmt.setString(2, name);
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			String gender = args[3];
			pstmt.setString(4, gender);
			int count = pstmt.executeUpdate();
			System.out.println(count+ " Rows inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					conn.close();
				}
				if(reader!=null) {
					reader.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();		}
		}
	}
}
