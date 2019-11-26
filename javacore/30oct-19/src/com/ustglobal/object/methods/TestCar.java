package com.ustglobal.object.methods;

public class TestCar {

	public static void main(String[] args) {
	Car c1=new Car(2000000, "tata","white");
	Car c2=new Car(4500000,"BMW","Black");
	Car c3=new Car(9000000,"Farari","Red");
	int c1HashCode=c1.hashCode();
	int c2HashCode=c2.hashCode();
	int c3HashCode=c3.hashCode();
	System.out.println("HashCode of c1 is "+c1);
	System.out.println(c1);
	System.out.println("HashCode of c2 is "+c2);
	System.out.println(c2);
	System.out.println("HashCode of c3 is "+c3);
	System.out.println(c3);
	
	}

}
