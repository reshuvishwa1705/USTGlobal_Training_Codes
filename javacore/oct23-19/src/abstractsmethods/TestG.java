package abstractsmethods;

public class TestG {

	public static void main(String[] args) {
		System.out.println("==================");
		Circle c=new Circle();
		c.move();
		c.shape();
		System.out.println("==================");
		Rectangle r=new Rectangle();
		r.move();
		r.shape();
		System.out.println("==================");
		Square s=new Square();
		s.move();
		s.shape();
		System.out.println("==================");

	}

}
