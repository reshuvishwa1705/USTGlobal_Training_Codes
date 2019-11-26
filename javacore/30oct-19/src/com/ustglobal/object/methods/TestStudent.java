package com.ustglobal.object.methods;

public class TestStudent {
	public static void main(String[] args) {

		Student s=new Student(101,"Rinkiya",78);
		int sHashCode= s.hashCode();
		System.out.println("HashCode of s is "+sHashCode);
		System.out.println(s);
	}
}
