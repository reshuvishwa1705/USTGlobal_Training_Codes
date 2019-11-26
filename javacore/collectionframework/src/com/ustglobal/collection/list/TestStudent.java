package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(101, "A",78.88);
		Student s2=new Student(102, "B",98.88);
		Student s3=new Student(103, "C",88.88);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("----------By for loop----------");
		for(int i=0;i<al.size();i++) {
			Student s=al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.per);
		}
		System.out.println("-------------By for each--------");
		for(Student s:al) {
			System.out.println(s);
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
