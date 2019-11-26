package com.ustglobal.hasarelation.association;

public class TestB {
public static void main(String[] args) {
	Car c=new Car();
	System.out.println("Car Brand "+c.brand);
	System.out.println("Car color "+c.clr);
	c.move();
	System.out.println("Singer: "+c.m.singer);
	System.out.println("Song Type "+c.m.type);
	c.m.song();//HAS A RELATIONSHIP
}
}
