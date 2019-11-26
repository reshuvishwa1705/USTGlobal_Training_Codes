package com.ustglobal.lambdaexpression;

public class TestFact {
public static void main(String[] args) {
	FactorialInterface fi=a->{
		int f=1;
		for(int i=1;i<=a;i++) {
			f=i*f;
		}
		return f;
	};
	System.out.println("Factorial is "+fi.fact(5));
}
}
