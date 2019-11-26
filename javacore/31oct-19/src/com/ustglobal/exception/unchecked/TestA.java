package com.ustglobal.exception.unchecked;

public class TestA {
public static void main(String[] args) {
	int[] a= {10,30,49};
	System.out.println(a[0]);
	try {
		System.out.println(a[3]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("are suno index check kro phle");
	}
	System.out.println(a[2]);
}
}
