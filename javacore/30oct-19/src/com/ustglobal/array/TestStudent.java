package com.ustglobal.array;

public class TestStudent {
public static void main(String[] args) {
	Student s1=new Student(101, "a", 90);
	Student s2=new Student(102, "b", 95);
	Student s3=new Student(103, "c", 93);
	Student s[]=new Student[3];
	s[0]=s1;
	s[1]=s2;
	s[2]=s3;
	System.out.println("Student Array");
	for(Student st:s) {
		System.out.println(st);
	}
	receive(s);
}
static void receive(Student s[]) {
	System.out.println("By Recieve() Method");
	for(Student st:s) {
		System.out.println(st);
	}
}
}
