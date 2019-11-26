
public class TestB {
	int a;
public TestB() {
System.out.println("TestB Constructor");
}
	static int  b;
	{
		a=10;
		b=20;
System.out.println("Instance block 1");
	}
	public static void main(String[] args) {
		TestB t=new TestB();
		
	}
	{
		a=1;
		b=2;
System.out.println("Instance block 2");
	}
	{
		a=100;
		b=200;
System.out.println("Instance block 3");
	}
}
