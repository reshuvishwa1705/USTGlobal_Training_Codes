package com.ustglobal.collection.set;

import java.util.HashSet;
import java.util.Iterator;


public class TestG {
	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(101, "a",50000);
		Employee e2 = new Employee(102, "b",55000);
		Employee e3 = new Employee(103, "c",56000);
		Employee e4 = new Employee(104, "d",59000);
		Employee e5 = new Employee(104, "d",59000);
		hs.add(e2);
		hs.add(e4);
		hs.add(e1);
		hs.add(e3);
		hs.add(e5);
		Iterator<Employee> it = hs.iterator();
		System.out.println("********USING FOR ITERATOR************");
		while (it.hasNext()) {
			Employee e = (Employee) it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.sal);
			System.out.println("---------------------");
		}
	}
}
