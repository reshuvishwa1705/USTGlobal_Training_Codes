package accessModifier.pkg1;

public class Run {
public static void main(String[] args) {
	Demo d=new Demo();
		/*
		 * System.out.println(d.a);
		 * d.add();
		 * we cannot access private member 
		 */	
	//default member can be accessible
	System.out.println(d.b);
	d.sub();
	//protected member can be accesed
	System.out.println(d.c);
	d.mul();
	//public member can be accesed
	System.out.println(d.name);
	d.div();
}
}
