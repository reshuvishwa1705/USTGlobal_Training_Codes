package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.employeedb.EmployeeDB;

public class EmployeeDAOImpl extends EmployeeDB implements EmployeeDAO{
	private final static String SELECT_SQL = "select * from employee";
	private final static String INSERT_SQL = "insert into employee values(?,?,?,?)";
	private final static String DELETE_SQL = "delete from employee where id=?";
	private final static String SEARCH_SQL = "select * from employee where id=?";
	private final static String UPDATE_SQL = "update employee set name=? where id=?";

	public List<EmployeeBean> getAllEmployeeData() {
		try(Connection conn = EmployeeDB.getDbConnection();Statement stmt = conn.createStatement()) {
			try(ResultSet rs = stmt.executeQuery(SELECT_SQL)){
				ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
				while(rs.next()) {
					EmployeeBean bean = new EmployeeBean();
					int id = rs.getInt("id");
					bean.setId(id);
					String name = rs.getString("name");
					bean.setName(name);
					int sal = rs.getInt("sal");
					bean.setSal(sal);
					String gender = rs.getString("gender");
					bean.setGender(gender);
					result.add(bean);
				}
				return result;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}//end of getAllEmployee

	public int insertEmployeeData(EmployeeBean bean)  {   
		try(Connection conn = EmployeeDB.getDbConnection();PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);) {
			int id = bean.getId();
			pstmt.setInt(1,id);
			String name = bean.getName();
			pstmt.setString(2, name);
			int sal = bean.getSal();
			pstmt.setInt(3, sal);
			String gender = bean.getGender();
			pstmt.setString(4, gender);
			int count = pstmt.executeUpdate();
			return count;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}//end of insertEmployeeData
	public int updateEmployeeData(EmployeeBean bean) {
		try(Connection conn = EmployeeDB.getDbConnection(); PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL)) {
			int id = bean.getId();
			pstmt.setInt(2, id);
			String name = bean.getName();
			pstmt.setString(1, name);
			int count = pstmt.executeUpdate();
			return count;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}//end of updateEmployeeData
	public int deleteEmployeeData(int id) {   
		try(Connection conn = EmployeeDB.getDbConnection();PreparedStatement pstmt = conn.prepareStatement(DELETE_SQL)) {
			pstmt.setInt(1, id);
			int count = pstmt.executeUpdate();
			return count;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}
	public EmployeeBean searchEmployeeData(int id) {
		try(Connection conn = EmployeeDB.getDbConnection();PreparedStatement pstmt = conn.prepareStatement(SEARCH_SQL)) {
			pstmt.setInt(1, id);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					EmployeeBean bean = new EmployeeBean();
					bean.setId(rs.getInt("id"));
					bean.setName(rs.getString("name"));
					bean.setSal(rs.getInt("sal"));
					bean.setGender(rs.getString("gender"));
					return bean;
				}
				else {
					return null;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}//end of searchEmployeeData() 
}//end of EmployeeDAOImpl
