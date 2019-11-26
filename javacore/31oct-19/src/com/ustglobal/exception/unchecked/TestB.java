package com.ustglobal.exception.unchecked;

public class TestB {
	public static void main(String[] args) {
		int a=0;
		int[] arr= {10,25,66};
	
		try {
			 a=10/2;
			System.out.println("Hello ghatiya ladki");
			 arr[4]=0;
		}
				catch (ArithmeticException e) {
			System.out.println("Number is divided by zero");	
		}
		catch (Exception e) {
			System.out.println("Mera bala code ding dong ding krta h");	
			}

		System.out.println(a);
	}
}
