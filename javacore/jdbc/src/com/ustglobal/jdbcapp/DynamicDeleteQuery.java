package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DynamicDeleteQuery {
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
		pstmt = conn.prepareStatement(prop.getProperty("delete-query"));
		pstmt.setInt(1, Integer.parseInt(args[0]));
		int count = pstmt.executeUpdate();
		System.out.println(count+" Rows Deleted");
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
