package com.ustglobal.encapsulation.bean;

public class TestA {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(101);
		s.setName("Abhay Raichand");
		s.setRollno(1);
		Database db=new Database();
		db.receive(s);
		Employee e=new Employee();
		e.setId(1);
		e.setName("Rinku");
		e.setSalary(25000);
		e.setDept("Developer");
		e.setDesignation("Software Developer");
		db.save(e);
	}

}
