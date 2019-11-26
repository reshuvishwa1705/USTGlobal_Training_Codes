class P{
	String name;
	int age;
}
public class Person {
String name;
int age;
public Person(String pname, int page) {
	name=pname;
	age=page;
}
	public static void main(String[] args) {
		Person p=new Person("Divya", 22);
		P p1=new P();
		System.out.println(p1.name);
		System.out.println(p1.age);
//	System.out.println(p.name);
//	System.out.println(p.age);
	}

}
