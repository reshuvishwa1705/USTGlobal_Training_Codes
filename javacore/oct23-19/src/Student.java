
public class Student {
String name;
int rollno;
final String cname="Qspiders";
final int cid;
public Student() {
	this.cid=20;
	this.name="Pinku";
}

public Student(String name, int rollno,int cid) {
this.rollno=rollno;
this.name=name;
this.cid=cid;

}
final void printDetails() {
	System.out.println("Hi "+name+ " Welcome to "+cname);
}
final void printDetails(int rollno) {
	System.out.println("Hi "+rollno+ " Welcome to "+cid);
}

}
