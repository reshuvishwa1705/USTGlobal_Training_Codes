package com.ustglobal.object.methods;

public class Remote {
void add() {
	System.out.println("add() method");
	
}
public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	Remote r= new Remote();
	Class c=r.getClass();
 Object o=c.newInstance();
 Remote r1=(Remote)o;
 r1.add();
}
}
