package com.ustglobal.exception.unchecked;

public class TestE {
public static void main(String[] args) {
	System.out.println("Main Started");
	int[] a= {10,545,88};
	int b=2;
	String s="Hello";
	String s1=s.toUpperCase();
	try {
		System.out.println(s1);
		System.out.println(a[2]);
		System.out.println(b/0);
	}
	catch (ArithmeticException e) {
	System.out.println("Number divided by zero");
	}
	catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Index is not present");
	}
	catch (NullPointerException e) {
		System.out.println("Don't play with null");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("Main Ended");
}
}
