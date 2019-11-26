package com.ustglobal.exception.checked;

public class TestA {
public static void main(String[] args) {
	System.out.println("Main Started");
	try {
		Thread.sleep(3000);
		System.out.println("inside try");
	} catch (InterruptedException e) {
		System.out.println("Exception Occured");
		e.printStackTrace();
	}
	System.out.println("Main End");
}
}
