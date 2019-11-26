package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	try {
		//Step 1 load the driver
		Driver driver = new Driver();
	  DriverManager.registerDriver(driver);
	//Step 2 get the connection
	  String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=reshu";
	  conn = DriverManager.getConnection(url);
	//Step 3 issue SQL query
	  //It is the one way to insert dynamically String sql = "insert into employee values("+args[0]+",'"+args[1]+"',"+args[2]+",'"+args[3]+"')";
	  String sql = " insert into employee values(7,'mani',65000,'F') ";
	  stmt = conn.createStatement();
	  int count = stmt.executeUpdate(sql);
	//Step 4 read the result
	  System.out.println(count + " Rows inserted");
	  
	  
	  
	} catch (SQLException e) {
	e.printStackTrace();	
	}
	finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}
}
}
