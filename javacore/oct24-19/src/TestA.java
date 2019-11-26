
public class TestA {
static int a;
int b;
static {
	a=10;
	System.out.println("static block 1");
}
public TestA() {
System.out.println("Constructor");
}
public static void main(String[] args) {
	TestA t1=new TestA();
	TestA t2=new TestA();
	System.out.println("Value of a is "+a);
}
static {
	a=20;
	System.out.println("static block 2");
}
static {
	a=10;
	System.out.println("static block 3");
}
}
