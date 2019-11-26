package com.ustglobal.tryresoure;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateWithTryResource {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("db.properties")) {
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("update-query");
			try (Connection conn = DriverManager.getConnection(url,prop)){
				PreparedStatement pstmt = conn.prepareStatement(sql);
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
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
