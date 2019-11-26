package com.ustglobal.exception.unchecked;

public class TestC {
public static void main(String[] args) {
	int[] a= {10,545,88};
	int b=2;
	try {
		System.out.println(a[4]);
	} catch (ArithmeticException e) {
	System.out.println("Number divided by zero");
	}
	catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Index is not present");
	}
}
}
