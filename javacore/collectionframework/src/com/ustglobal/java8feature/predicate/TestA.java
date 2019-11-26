package com.ustglobal.java8feature.predicate;

import java.util.function.Predicate;

public class TestA {
public static void main(String[] args) {
	Person p = new Person(22,"Pika");
	Person p1 = new Person(17,"Pikka");
	Predicate<Person> pre = a ->{
		if(a.age>17) {
			return true;
		}
		else
			return false;
	};
	boolean b = pre.test(p);
	System.out.println("Age of person is greater then 18 "+b );
}
}
