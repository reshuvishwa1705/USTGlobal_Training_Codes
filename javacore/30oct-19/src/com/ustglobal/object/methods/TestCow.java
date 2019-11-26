package com.ustglobal.object.methods;

public class TestCow {
public static void main(String[] args) {
	Cow c1=new Cow(101, "syama", 50000);
	Cow c2=new Cow(102, "ganga", 25000);
	Cow c3=new Cow(101, "syama", 50000);
	Cow c4=c1;
	System.out.println(c1.hashCode());
	System.out.println(c4.hashCode());
	System.out.println(c1.equals(c2));
	System.out.println(c1.equals(c3));
	System.out.println(c1.equals(c4));
	
}
}

