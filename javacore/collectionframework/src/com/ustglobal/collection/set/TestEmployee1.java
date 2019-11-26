package com.ustglobal.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmployee1{
public static void main(String[] args) {
	Comparator<Employee1> comp=(e1,e2)->{
		Integer i = e1.id;
		Integer j = e2.id;
		return i.compareTo(j);
	};
	TreeSet<Employee1> ts = new TreeSet<Employee1>(comp);
	Employee1 e1 = new Employee1(101,"piku",5.0);
	Employee1 e2 = new Employee1(102,"pikku",5.2);
	Employee1 e3 = new Employee1(103,"peeku",5.7);
	Employee1 e4 = new Employee1(104,"pinku",5.5);
	ts.add(e3);
	ts.add(e2);
	ts.add(e1);
	ts.add(e4);
	Iterator<Employee1> it = ts.iterator();
	System.out.println("********USING FOR ITERATOR************");
	while (it.hasNext()) {
		Employee1 e = (Employee1) it.next();
		System.out.println("Id is "+e.id);
		System.out.println("Name is "+e.name);
		System.out.println("Height is "+e.height);
		System.out.println("---------------------");
	}

}
}
