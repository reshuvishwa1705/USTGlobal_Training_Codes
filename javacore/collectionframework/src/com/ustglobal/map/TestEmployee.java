package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.ustglobal.collection.set.Employee1;

public class TestEmployee {
public static void main(String[] args) {
	Employee e1=new Employee(101, "X", 45000.00);
	Employee e2=new Employee(102, "Y", 55000.12);
	Employee e3=new Employee(103, "Z", 54000.55);
	Employee e4=new Employee(104, "A", 45000.00);
	Employee e5=new Employee(105, "B", 85000.12);
	Employee e6=new Employee(106, "K", 65000.55);
	Employee e7=new Employee(107, "P", 35000.00);
	Employee e8=new Employee(108, "R", 45000.12);
	Employee e9=new Employee(109, "T", 74000.55);
	ArrayList<Employee> al1 = new ArrayList<Employee>();
	al1.add(e2);
	al1.add(e1);
	al1.add(e3);
	ArrayList<Employee> al2 = new ArrayList<Employee>();
	al2.add(e6);
	al2.add(e4);
	al2.add(e5);
	ArrayList<Employee> al3 = new ArrayList<Employee>();
	al1.add(e9);
	al1.add(e7);
	al1.add(e8);
	
	HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
	hm.put("first",al1);
	hm.put("second",al2);
	hm.put("third",al3);
	ArrayList<Employee> first = hm.get("first");
	Iterator<Employee> it = first.iterator();
	while (it.hasNext()) {
		Employee e= (Employee) it.next();
		System.out.println("Id is "+e.id);
		System.out.println("Name is "+e.name);
		System.out.println("Salary is "+e.sal);
		System.out.println("---------------------");
		
	}
	
	
}
}
