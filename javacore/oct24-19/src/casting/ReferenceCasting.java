package casting;

public class ReferenceCasting {

	public static void main(String[] args) {
		Pen p=new Pen();
		p.write();
//		p.color(); parent class reference cannot access child class specific method
	Pen p1=new Marker(); //It is upcasting but p1 cant access child class specific method
	p1.cost=50;
	System.out.println("Cost of Marker"+p1.cost);
	p1.write();//once you overridden method you get overridden implementation
	Marker m=(Marker)p1;
	m.color();
	m.size=20;
	System.out.println("Size of marker is "+m.size);

	
	}

}
