package com.ustglobal.streams.list;

import java.util.ArrayList;

import com.ustglobal.java8feature.Student;

public class TestF {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s1 = new Student(1, "s", 58.25);
	Student s2 = new Student(2,"Arup",78.55);
	Student s3 = new Student(3,"Anupma",85.55);
	al.add(s2);
	al.add(s3);
	al.add(s1);
	al.add(new Student(4,"v", 35.65));
	al.add(new Student(5, "f", 30.12));
	Helper h = new Helper();
//	h.displayAllStudent(al);
	h.displayFailedStudent(al);
	h.displayPassedStudent(al);
	h.displayTopperStudent(al);
	h.displayBackbenchStudent(al);
	
	
}
}
