
public class TestC {

	public static void main(String[] args) {
		BTM b=new BTM();
		b.swipe();
		System.out.println("Count Value "+b.getCount());
		System.out.println("Total Count "+b.getTotalCount());

		BTM b1=new BTM();
		b1.swipe();
		System.out.println("Count Value "+b1.getCount());
		System.out.println("Total Count "+b1.getTotalCount());
		b1.swipe();
		System.out.println("Total Count "+b1.getTotalCount());

	}

}
