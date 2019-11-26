package com.ustglobal.encapsulation.bean;

public class Database {
 void receive(Student s) {
	 System.out.println("Student Id is "+s.getId());
	 System.out.println("Student Name "+s.getName());
	 System.out.println("Student Rollno. "+s.getRollno());
	 System.out.println("===============================");
 }
 void save(Employee e) {
	 System.out.println("Employee Id is "+e.getId());
	 System.out.println("Employee Name "+e.getName());
	 System.out.println("Employee Salary "+e.getSalary());
	 System.out.println("Employee Department "+e.getDept());
	 System.out.println("Employee Designation "+e.getDesignation());
	 System.out.println("===============================");
 }
}
