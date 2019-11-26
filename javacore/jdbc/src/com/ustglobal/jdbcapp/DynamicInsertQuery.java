package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
//import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;
public class DynamicInsertQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=reshu";
		String sql = "insert into employee values(?,?,?,?)";
		try {
			//			Driver driver = new Driver();
			//			DriverManager.registerDriver(driver);
			//Step 1 load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Step 2 get the connection
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
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
			} catch (Exception e2) {
				e2.printStackTrace();		}
		}
	}
}
