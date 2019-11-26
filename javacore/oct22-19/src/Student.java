
public class Student {
String name;
int sid;
String clgName;
String email;
long contact;
public Student(String name,int sid,String clgName, String email,long contact ) {
	this.name=name;
	this.sid=sid;
	this.clgName=clgName;
	this.email=email;
	this.contact=contact;
}
public void displayData() {
	System.out.println("Student Name "+name);
	System.out.println("Student Id "+sid);

	System.out.println("Student College Name "+clgName);

	System.out.println("Student Email "+email);

	System.out.println("Student Contact "+contact);

}
public static void main(String[] args) {
	Student s1=new Student("A", 101, "Jnct", "a@gmail.com", 5541534154l);
	s1.displayData();
	Student s2=new Student("B", 102, "Lnct", "b@gmail.com", 5566266266l);
	s2.displayData();
	Student s3=new Student("C", 103, "Jncts", "c@gmail.com", 5541451521l);
	s3.displayData();
	Student s4=new Student("D", 104, "Lncte", "d@gmail.com", 5512312136l);
	s4.displayData();
	Student s5=new Student("E", 105, "Jnct", "e@gmail.com", 6562133217l);
	s5.displayData();
	Student s6=new Student("F", 106, "Jncts", "f@gmail.com", 8884845558l);
	s6.displayData();
	Student s7=new Student("G", 107, "Lncts", "g@gmail.com", 1513213129l);
	s7.displayData();
	Student s8=new Student("H", 108, "Lnct", "h@gmail.com", 8548452131l);
	s8.displayData();
	Student s9=new Student("I", 109, "Jnct", "i@gmail.com", 5565552226l);
	s9.displayData();
	Student s10=new Student("J", 110, "Jnct", "j@gmail.com", 7478454523l);
	s10.displayData();
	
	
	
	
	
	
}
}
