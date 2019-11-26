package com.ustglobal.java8feature;

import java.util.function.Predicate;

public class TestStudent {
public static void main(String[] args) {
	Predicate<Student> p = s ->{
		if(s.per>=35)
			return true;
		else
			return false;
	};
	Student s1 = new Student(101,"Arup",30.55);
	boolean b = p.test(s1);
	System.out.println("Student is pass "+b);
	
}
}
