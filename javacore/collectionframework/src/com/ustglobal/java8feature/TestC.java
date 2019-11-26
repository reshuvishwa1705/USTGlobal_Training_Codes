package com.ustglobal.java8feature;

import java.util.function.Function;

public class TestC {
public static void main(String[] args) {
	Function<Integer, Student> f = id -> {
		Student s = new Student(102, "Ranu", 99.15);
		s.id=id;
		return s;
	};
	Student s1 = f.apply(2);
	System.out.println("Id is "+s1.id);
	System.out.println("Name is "+s1.name);
	System.out.println("Percentage is "+s1.per);
}
}
