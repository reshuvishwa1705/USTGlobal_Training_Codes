
public class PersonTest {

	public static void main(String[] args) {
		Person p=new Person();
		p.clr="Fair";
		p.age=22;
		Person.name="Reshu";
		System.out.println("Person Name is "+Person.name);
		System.out.println(Person.name+" Color is "+p.clr);
		System.out.println(Person.name+" Age is "+p.age);
		p.eat();
		p.walk();
		Person.sleep();
	}

}
