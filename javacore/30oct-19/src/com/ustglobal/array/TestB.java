package com.ustglobal.array;

public class TestB {
public static void main(String[] args) {
	int[] n= {1,23,45,32};
//	System.out.println(n[10]); ARRAYINDEXOUTOFBOUNDS
receive(n);
int v[]=getArray();
System.out.println("Integer Array");
for(int v1:v) {
	System.out.println(v1);
}
System.out.println("String Array");
String []s1=getStringArray();
for(String s2:s1) {
	System.out.print(s2+" ");
}
}
static void receive(int[] n1) {
	for(int n2:n1) {
		System.out.println(n2);
	}
}
static int [] getArray() {
	int[] val= {1,6,9,7,5,6};
	return val;
}
static String[] getStringArray() {
	String[] s= {"a","v","f","g"};
	return s;
}
}
