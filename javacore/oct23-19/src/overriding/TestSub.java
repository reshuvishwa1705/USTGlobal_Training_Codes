package overriding;

public class TestSub {
	public static void main(String[] args) {
		SuperClass s1=new SuperClass();
		s1.count();
		System.out.println("==========================");
		SubClass s=new SubClass();
		s.add();
		s.count();
		System.out.println("==========================");
		
	}

}
