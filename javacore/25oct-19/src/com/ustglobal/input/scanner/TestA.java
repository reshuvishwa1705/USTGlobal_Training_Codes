package com.ustglobal.input.scanner;

import java.util.Scanner;

public class TestA {
public static void main(String[] args) {
	System.out.println("Scanner Class");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Age");
	int age=sc.nextInt();
	System.out.println("Age is "+age);
	System.out.println("Enter string");
	String msg=sc.next();
	System.out.println("Enter String line");
	String line=sc.nextLine();
	System.out.println("Message is "+msg);
	System.out.println("Line is "+line);
}
}
