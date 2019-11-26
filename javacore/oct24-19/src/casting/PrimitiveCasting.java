package casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		byte b=34;
		//Implicit type casting
		int a=b;
		double d=9.59;
		//Explicit Type Casting
		int n=(int)d;	
		System.out.println("Value of a is "+a);
		System.out.println("Value of d is "+n);
		double x=76.34;
		int n1=(int)x;
		System.out.println("n1 is "+n1);
		byte b1=(byte)x;
		System.out.println("b1 is "+b1);
		char c=(char)x;
		System.out.println("c is "+c);
	}
}
