package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestTeacher {
	public static void main(String[] args) {
		Teacher t1 = new Teacher(101, "a", "Java");
		Teacher t2 = new Teacher(102, "b", "JavaScript");
		Teacher t3 = new Teacher(103, "c", "SQL");
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		al.add(t1);
		al.add(t2);
		al.add(t3);
		System.out.println("----------By for loop----------");
		for(int i=0;i<al.size();i++) {
			Teacher t=al.get(i);
			System.out.println("Id is "+t.id);
			System.out.println("Name is "+t.name);
			System.out.println("Percentage is "+t.subject);
		}
		System.out.println("-------------By for each--------");
		for(Teacher t:al) {
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
