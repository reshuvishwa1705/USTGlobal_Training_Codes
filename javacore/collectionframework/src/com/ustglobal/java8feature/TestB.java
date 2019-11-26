package com.ustglobal.java8feature;

import java.util.function.Function;

public class TestB {
public static void main(String[] args) {
	Function<Integer, Integer> f = i -> i*i;
	Integer i = f.apply(5);
	System.out.println("Square of 5 is "+i);
	Integer j = f.apply(6);
	System.out.println("Square of 6 is"+j);
	
}
}
