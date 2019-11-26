package com.ustglobal.exception.unchecked;

public class TestD {
public static void main(String[] args) {
	int[] a= {10,545,88};
	int b=2;
	try {
		System.out.println(b/0);
	} catch (ArithmeticException e) {
	System.out.println("Number divided by zero");
	}
	try {
		a[4]=0;
	} 
	catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Index is not present");
	}
}
}
