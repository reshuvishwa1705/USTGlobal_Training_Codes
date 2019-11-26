package com.ustglobal.java8feature;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestD {
public static void main(String[] args) {
	Supplier<Student> su1 = () -> new Student(103,"sie", 78.21);
	Student s1 = su1.get();
	System.out.println("Id is "+s1.id);
	System.out.println("Name is "+s1.name);
	System.out.println("Percentage is "+s1.per);
	System.out.println("------------------");
	Supplier<Integer> su2 = () -> 20;
	int val = su2.get();
	System.out.println(val);
	System.out.println("------------------");
	Supplier<String> su3 = () -> "RV";
	String str = su3.get();
	System.out.println(str);
	System.out.println("------------------");
	Consumer<Student> c = s ->{
		System.out.println("Id is "+s1.id);
		System.out.println("Name is "+s1.name);
		System.out.println("Percentage is "+s1.per);
		System.out.println("------------------");
	};
	Student s2 = new Student(101,"Arup",30.55);
	c.accept(s2);
	Consumer<String> c1 = str1 -> System.out.println(str1);
	c1.accept("JAva Java");
	System.out.println("------------------");
	
}
}
