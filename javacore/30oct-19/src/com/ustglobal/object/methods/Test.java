package com.ustglobal.object.methods;

public class Test {

	public static void main(String[] args) {
		Pen p=new Pen();
		int pHashCode=p.hashCode();
		System.out.println("HashCode of p is "+pHashCode);
		Pen p1=new Pen();
		int p1HashCode=p1.hashCode();
		System.out.println("HashCode of p1 is "+p1HashCode);
	}

}
