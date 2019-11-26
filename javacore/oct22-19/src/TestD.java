
public class TestD {
	final void add() {
		System.out.println("add() method");
	}
	final void add(int a) {
		System.out.println("add(int a) method");
	}
	public static void main(String[] args) {
		SuperClas sc=new SuperClas();
		System.out.println("******************");
		SubClass suc=new SubClass();
		suc.getSData();
	}

}
