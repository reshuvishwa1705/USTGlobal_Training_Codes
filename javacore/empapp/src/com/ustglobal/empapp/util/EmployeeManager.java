package com.ustglobal.empapp.util;
//It is factory class

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;

public class EmployeeManager {
	private EmployeeManager() {}
	//it is factory method
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
