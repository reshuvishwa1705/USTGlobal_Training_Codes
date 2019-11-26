package com.ustglobal.array;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class TestA {
public static void main(String[] args) {
	int []nums=new int[5];
	nums[0]=21;
	nums[1]=01;
	nums[2]=81;
	nums[3]=91;
	nums[4]=31;
	for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i]);
	}
	System.out.println("Retrieve by for each loop");
	for(int i:nums) {
		System.out.println(i);
	}
	System.out.println("Boolean Array");
	boolean b[]=new boolean[5];
	for(boolean b1:b) {
		System.out.println(b1);
	}
	System.out.println("Byte Array");
	byte []by=new byte[4];
	by[0]=1;
	by[1]=3;
	by[2]=5;
	by[3]=1;
	for(int i:by) {
		System.out.println(i);
	}
	System.out.println("Double Array");
	double []d=new double[4];
	d[0]=1.0;
	d[1]=16.0;
	d[2]=12.0;
	d[3]=1.00;
	for(double d1:d) {
		System.out.println(d1);
	}
System.out.println("String Array");
String[] s=new String[4];
s[0]="a";
s[1]="ab";
s[2]="anb";
s[3]="amn";
for(String s1:s) {
	System.out.println(s1);
}
}
}
