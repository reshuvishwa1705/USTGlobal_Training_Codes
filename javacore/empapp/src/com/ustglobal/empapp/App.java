package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search employee data");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
		case 1: 
			EmployeeDAO impl = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result=impl.getAllEmployeeData();
			for (EmployeeBean bean : result) {
				System.out.println("Name "+bean.getName());
				System.out.println("Id "+bean.getId());
				System.out.println("Gender "+bean.getGender());
				System.out.println("Salary "+bean.getSal());
				System.out.println("-----------------------");
			}
			break;
		case 2:
			EmployeeDAO impl2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean = new EmployeeBean();
			int id1 = sc.nextInt();
			String name1 = sc.next();
			int sal1 = sc.nextInt();
			String gender1 = sc.next();
			System.out.println("Enter id ");
			bean.setId(id1);
			System.out.println("Enter name ");
			bean.setName(name1);
			System.out.println("Enter salary ");
			bean.setSal(sal1);
			System.out.println("Enter gender ");
			bean.setGender(gender1);
			int count1 = impl2.insertEmployeeData(bean);
			System.out.println(count1+ " Row(s) inserted");
			
			break;
		case 3:
			EmployeeDAO impl3 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean2 = new EmployeeBean();
			System.out.println("Enter id for updated");
			int id2 = sc.nextInt();
			System.out.println("Enter name ");
		    String name2 = sc.next();
		    bean2.setId(id2);
		    bean2.setName(name2);
			int count2 = impl3.updateEmployeeData(bean2);
			System.out.println(count2+" Row(s) updated");
			break;
		case 4:
			EmployeeDAO impl4 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter id for delete ");
			int id3 = sc.nextInt();
			int count3 = impl4.deleteEmployeeData(id3);
			System.out.println(count3+" Row(s) deleted");
			break;
		case 5:
			EmployeeDAO impl5 = EmployeeManager.getEmployeeDAO();
			int id4 = sc.nextInt();
			EmployeeBean result5 = impl5.searchEmployeeData(id4);
				 
			
			break;
		}
		
	}
}
