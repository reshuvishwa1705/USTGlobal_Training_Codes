package com.ustglobal.exception.unchecked;

public class TestPaytm {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Paytm p=new Paytm();
		
		try {
			p.book();
		} catch (ArithmeticException e) {
			System.out.println("Exception caught in main");
		}
		finally {
			System.out.println("Executing finally");
		}
		System.out.println("Main Ended");
	}

}
