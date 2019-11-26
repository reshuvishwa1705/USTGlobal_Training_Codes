
public class TestA {
public static void add(int a,int b) {
	System.out.println("add(int a, int b) method");
}
public static void add(byte a,int b) {
	System.out.println("add(byte a, int b) method");
}
public int multiply(int a,int b) {
	System.out.println("multiply(int a,int b) method");
	return a*b;
}
public int multiply(byte a,int b) {
	System.out.println("multiply(byte a,int b) method");
	return a*b;
}
public static void main(int a) {
	System.out.println("main(int a) method");
	
}
public static void main(String[] args) {
	System.out.println("main(String[] args)");
	main(10);
	add(20, 100);
	add(12, 55);
	TestA t=new TestA();
	t.multiply(5, 2);
	t.multiply(9, 2);
}
}
