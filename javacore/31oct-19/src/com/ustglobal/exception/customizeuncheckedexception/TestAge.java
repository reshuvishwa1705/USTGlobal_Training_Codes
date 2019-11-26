package com.ustglobal.exception.customizeuncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Validator v=new Validator();

		try {
			v.verify(2);
		} catch (InvalidAgeException e) {
			System.out.println("Exception Occured");
		}
		v.verify(2);
		System.out.println("Main Ended");
	}
}
