package com.ustglobal.lambdaexpression;

public class TestMultiply {

	public static void main(String[] args) {
		MultiplyInterface mi=(a,b)->a*b;//"Lambda Expression"
		System.out.println(mi.multi(20, 0));
	}

}
