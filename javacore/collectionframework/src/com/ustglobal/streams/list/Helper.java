package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.ustglobal.java8feature.Student;

public class Helper {
void displayAllStudent(ArrayList<Student> al) {
	Iterator<Student> it = al.iterator();
	while (it.hasNext()) {
		Student s = (Student) it.next();
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.per);
		System.out.println("------------------------");
		
	}
}
void displayFailedStudent(ArrayList<Student> al) {
	List<Student> l = al.stream().filter(student -> student.per<40).collect(Collectors.toList());
	System.out.println("Failed Student Data Are...");
	for (Student s : l) {
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.per);
		System.out.println("------------------------");
		
	}
}
void displayPassedStudent(ArrayList<Student> al) {
	List<Student> l = al.stream().filter(student -> student.per>40).collect(Collectors.toList());
	System.out.println("Passed Student Data Are...");
	for (Student s : l) {
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.per);
		System.out.println("------------------------");
		
	}
}
void displayTopperStudent(ArrayList<Student> al) {
	Comparator<Student> cmp = (o1,o2)->{
		Double d1 = o1.per;
		Double d2 = o2.per;
		return d1.compareTo(d2);
	};
	System.out.println("***********Topper is************");
	Student s = al.stream().max(cmp).get();
	System.out.println("...."+s.name+"....");
	System.out.println("--------------------");
}
void displayBackbenchStudent(ArrayList<Student> al) {
	Comparator<Student> cmp = (o1,o2)->{
		Double d1 = o1.per;
		Double d2 = o2.per;
		return d1.compareTo(d2);
	};
	Student s = al.stream().min(cmp).get();
	System.out.println("Backbench Student is "+s.name);
	System.out.println("----------------------");
}
}
