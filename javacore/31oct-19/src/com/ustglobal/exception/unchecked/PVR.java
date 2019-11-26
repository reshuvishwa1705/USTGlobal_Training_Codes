package com.ustglobal.exception.unchecked;

public class PVR {
	void book() {
		System.out.println("booking started");
		try {
			System.out.println(2/0);
			System.out.println("Logic of Booking");
			System.out.println("booking confirmed");
		} catch (ArithmeticException ae) {
			System.out.println("booking failed");
			throw ae;
		}
	}
}
