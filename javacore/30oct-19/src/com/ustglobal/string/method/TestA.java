package com.ustglobal.string.method;

public class TestA {
public static void main(String[] args) {
	String s1="abo";
	System.out.println(s1.toUpperCase());
	String s2="duplicate";
	String s3=new String("anxiety");
	s1="xyz";
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	String s4="XYZ";
	System.out.println(s1.equals(s4));
	System.out.println(s1.equalsIgnoreCase(s4));
	char c=s1.charAt(1);
	System.out.println(c);
	System.out.println(s2.toLowerCase());
	System.out.println(s3.toUpperCase());
	StringBuffer sb=new StringBuffer("Nikku");
	sb.append(" hahahaha");
	System.out.println(sb);
}
}
