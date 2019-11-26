
public class Employee2 {

	int eid;
	String name;
	long aadharno;
	public Employee2(String name, int eid,long aadharno) {
		this.name=name;
		this.eid=eid;
		this.aadharno=aadharno;
	}
	public Employee2(String name,int eid) {
	this.name=name;
	this.eid=eid;
	}
	public Employee2(int eid,String name) {
		this.name=name;
		this.eid=eid;
		}
	
	void display() {
		System.out.println("Employee Name "+name);
		System.out.println("Employee Id "+eid);
		System.out.println("Employee AAdharNo. "+aadharno);
	}

}
