package com.ustglobal.java8feature;

import java.util.function.Predicate;

public class TestA {
public static void main(String[] args) {
	Predicate<Integer> p = i -> {
		if(i%2==0) {
			return true;
		}
		else
			return false;
	};
	boolean b = p.test(5);
	if(b)
	System.out.println("Number is even");
	else
		System.out.println("Number is odd");
}
}
