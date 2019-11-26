package com.ustglobal.exception.unchecked;

public class TestF {
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
	
	catch (Exception e) {
		e.printStackTrace();
		System.out.println("Exception Ocurred");
	}
	System.out.println("Main Ended");
}
}
