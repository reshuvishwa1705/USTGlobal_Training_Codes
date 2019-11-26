package com.ustglobal.lambdaexpression;

public class TestGreet {

	public static void main(String[] args) {
	GreetInterface gi=(msg)->{
		System.out.println("Hello");
		System.out.println(msg);
	};
	gi.greet("Lambda Expression");
	
	}

}
