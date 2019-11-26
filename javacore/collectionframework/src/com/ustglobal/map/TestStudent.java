package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class TestStudent {
public static void main(String[] args) {
	Student s1=new Student(101, "Raj",78.88);
	Student s2=new Student(102, "Parth",98.88);
	Student s3=new Student(103, "Vivan",88.88);
	Student s4=new Student(104, "A",96.88);
	Student s5=new Student(105, "B",91.88);
	Student s6=new Student(106, "C",82.88);
	Student s7=new Student(107, "H",78.88);
	Student s8=new Student(108, "K",98.88);
	Student s9=new Student(109, "R",88.88);
	
	ArrayList<Student> al1 = new ArrayList<Student>();
	al1.add(s3);
	al1.add(s1);
	al1.add(s2);
	ArrayList<Student> al2 = new ArrayList<Student>();
	al2.add(s7);
	al2.add(s9);
	al2.add(s8);
	ArrayList<Student> al3 = new ArrayList<Student>();
	al3.add(s6);
	al3.add(s5);
	al3.add(s4);
	HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
	hm.put("first",al1);
	hm.put("second",al2);
	hm.put("third",al3);
	ArrayList<Student> first =hm.get("second");
	System.out.println("****************Using Iterator************");
	Iterator<Student> it = first.iterator();
	while (it.hasNext()) {
		Student s=it.next();
		System.out.println("Name is "+s.name);
		System.out.println("Id is "+s.id);
		System.out.println("Percentage is "+s.per);
		System.out.println("-------------------");
	}
	
	
}
}
