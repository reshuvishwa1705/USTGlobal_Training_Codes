
public class Employee {
String name;
int eid;
public Employee(String ename, int eeid) {
	name=ename;
	eid=eeid;
}
void printDetails() {
	System.out.println("Employee name "+name);
	System.out.println("Employee Id "+eid);
}
public static void main(String[] args) {
	Employee e=new  Employee("Abhay Raichand",120);
	e.printDetails();
	Employee e1=new  Employee("Krhitik",420);
	e1.printDetails();
	Employee e2=new  Employee("Rahul",1);
	e2.printDetails();
	
	
}
}
