
public class Student1 extends Person{
int rollNo;
String clgName;
public Student1(int rollNo,String name,String clgName,int age) {
	super(name,age);
this.clgName=clgName;
this.rollNo=rollNo;

}
void printDetails() {
	System.out.println("Student name is "+name);
	System.out.println("Student rollno is "+rollNo);
	System.out.println("Student college name is "+clgName);
	System.out.println("Student age is "+age);
}
}
