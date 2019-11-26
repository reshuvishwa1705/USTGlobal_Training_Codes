package com.ustglobal.immutableclass;

public class TestMyImmutableString {
public static void main(String[] args) {
	MyImmutableString m1=new MyImmutableString(101,"abc");
	System.out.println("m1 value "+m1.getName());
	System.out.println("m1 value "+m1.getRollno());
	MyImmutableString m2=m1.changeContent(102,"mini");
	System.out.println("m2 value "+m2.getName());
	System.out.println("m2 value "+m2.getRollno());
}
}
