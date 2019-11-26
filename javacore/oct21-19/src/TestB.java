
public class TestB {

	public static void main(String[] args) {
		Cow c=new Cow();
		c.name="RamPyari";
		c.clr="Brown";
		System.out.println(c.name);
		System.out.println(c.clr);
		c.eat();
		Cow c1=new Cow();
		System.out.println("------Second Object Is Welcome---------");
		c1.name="RamDullari";
		c1.clr="Black";
		System.out.println(c1.name);
		System.out.println(c1.clr);
		c1.eat();
		
	
	}

}
