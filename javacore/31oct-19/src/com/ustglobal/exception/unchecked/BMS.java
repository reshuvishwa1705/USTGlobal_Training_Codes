package com.ustglobal.exception.unchecked;

public class BMS {
	public static void main(String[] args) {
		System.out.println("BMS Started");
		PVR p=new PVR();
		try {
			p.book();
		} catch (ArithmeticException e) {
			System.out.println("try again later");	
		}
		System.out.println("BMS Ended");
	}
}
