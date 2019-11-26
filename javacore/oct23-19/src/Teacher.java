
public class Teacher extends Person{
String sub;
int sal;
public Teacher(String name,String sub, int sal,int age) {
	super(name, age);
	this.sub=sub;
	this.sal=sal;

}
void printDetails() {
	System.out.println("Teacher name is "+name);
	System.out.println("Teacher subject is "+sub);
	System.out.println("Teacher salary is "+sal);
	System.out.println("Teacher age is "+age);
}
}
