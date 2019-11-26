
public class Employee1 {
	String name;
	int eid;
	public Employee1(String name, int eid) {
		this.name=name;
		this.eid=eid;
	}
	void sayHello() {
		System.out.println("Hello "+name+" Welcome to UST Global company");
	}
	void printDetails() {
		System.out.println("Employee name "+name);
		System.out.println("Employee Id "+eid);
		this.sayHello();
	}
	public static void main(String[] args) {
		Employee1 e1=new Employee1("Raj", 101);
		e1.printDetails();
		Employee1 e2=new Employee1("Ramukaka", 102);
		e2.printDetails();
		Employee1 e3=new Employee1("Rajju", 103);
		e3.printDetails();
		

	}

}
