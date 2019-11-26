package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(101, "X", "CS");
		Employee e2=new Employee(103, "Y", "EC");
		Employee e3=new Employee(103, "Z", "ME");
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println("----------By for loop----------");
		for(int i=0;i<al.size();i++) {
			Employee e=al.get(i);
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Percentage is "+e.dept);
		}
		System.out.println("-------------By for each--------");
		for(Employee t:al) {
			System.out.println(t);
		}
		System.out.println("-----------By Iterator---------");
		Iterator it=al.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println("-----------By Iterator using for loop---------");
		Iterator it1=al.iterator();
		for(;it1.hasNext();) {
			Object o=it1.next();
			System.out.println(o);
		}
		System.out.println("-----------By ListIterator---------");
		System.out.println("==========Forward==========");
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("===========Backward===========");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}




	}
}
