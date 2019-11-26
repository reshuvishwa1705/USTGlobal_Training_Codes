package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResources {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url =prop.getProperty("url");
			String sql = prop.getProperty("select-query");

			try(Connection conn = DriverManager.getConnection(url,prop)) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
