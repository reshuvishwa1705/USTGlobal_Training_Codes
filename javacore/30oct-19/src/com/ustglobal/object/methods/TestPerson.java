package com.ustglobal.object.methods;

public class TestPerson {
public static void main(String[] args) throws CloneNotSupportedException {
	Person p1=new Person(101, "ooooo");
	System.out.println("p1 id is "+p1.id);
	System.out.println("p1 name is "+p1.name);
	System.out.println("---------------After Cloning----------------");
	Object o=p1.clone();
	Person p2=(Person)o;
	p2.id=201;
	p2.name="pinku";
	
	System.out.println("p2 id is "+p2.id);
	System.out.println("p2 name is "+p2.name);
	
}
}
