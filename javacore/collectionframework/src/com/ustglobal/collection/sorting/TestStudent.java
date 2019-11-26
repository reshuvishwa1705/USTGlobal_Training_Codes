package com.ustglobal.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(101,"A",68.55);
		Student s2 = new Student(102,"n",66.55);
		Student s3 = new Student(103,"L",78.55);
		Student s4 = new Student(104,"C",96.55);
		Student s5 = new Student(105,"b",88.55);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s4);
		al.add(s3);
		al.add(s5);
		Collections.sort(al);
		System.out.println(al);
		TestStudent ts = new TestStudent();
		ts.displayStudentDetails(al);

	}
	void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.per);
			System.out.println("-----------------------------");
		}
		
	}
}
