package com.ustglobal.lambdaexpression;

public class TestAdd implements AddInterface{

	public static void main(String[] args) {
		TestAdd ta=new TestAdd();
	System.out.println(ta.add(5, 10));

	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
