package com.ustglobal.hasarelation.association;

public class TestA {
public static void main(String[] args) {
	Person p=new Person();
	System.out.println("Oye sun "+p.name);
	p.sleep();
	p.eat();
	p.m.write(); //HAS-A RELATIONSHIPS
	System.out.println(p.m.clr);
System.out.println(p.m.size);
}
}
