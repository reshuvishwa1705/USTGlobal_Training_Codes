package com.ustglobal.collection.set;
import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
public static void main(String[] args) {
	TreeSet<Employee> ts = new TreeSet<Employee>();
	Employee e1 = new Employee(101, "a",50000);
	Employee e2 = new Employee(102, "b",55000);
	Employee e3 = new Employee(103, "c",56000);
	Employee e4 = new Employee(104, "d",59000);
	Employee e5 = new Employee(104, "d",59000);
	ts.add(e2);
	ts.add(e4);
	ts.add(e1);
	ts.add(e3);
	ts.add(e5);
	Iterator<Employee> it = ts.iterator();
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
