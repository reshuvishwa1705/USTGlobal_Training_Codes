package accessModifier.pkg2;

import accessModifier.pkg1.Demo;

public class Sample extends Demo{
	public static void main(String[] args) {
		Demo d=new Demo();
		/*
		 * System.out.println(d.a);
		 * d.add();
		 * we cannot access private member 
		 */	
		/*
		 * default member cannot be accessible 
		 * System.out.println(d.b); 
		 * d.sub();
		 */		
		//protected member can be accesed
		Sample s= new Sample();
		System.out.println(s.c);
		s.mul();
		//public member can be accesed
		System.out.println(d.name);
		d.div();
		
	}
}
