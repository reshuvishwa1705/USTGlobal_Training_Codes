package wrapperclass;

public class TestA {
public static void main(String[] args) {
	int a=10;
	System.out.println("a is "+a);
	Integer i=a; // AUTOBOXING
	System.out.println("i is "+i);
	Integer x=10;
	Integer z= new Integer(20);
	System.out.println("x is "+x);
	int y=x;  //UNBOXING
	System.out.println("y is "+y);
	Integer i1=Integer.parseInt("123");
//	Integer i1=Integer.parseInt("123String"); NUMBERFORMETEXCEPTION	
	Boolean b1=Boolean.parseBoolean("true");
	Boolean b2=Boolean.parseBoolean("dskkj");
	System.out.println("i1 is "+i1);
	System.out.println("b1 is "+b1);
	System.out.println("b2 is "+b2);
	
}
}
