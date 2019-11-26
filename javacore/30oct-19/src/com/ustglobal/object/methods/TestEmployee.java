package com.ustglobal.object.methods;

public class TestEmployee {
public static void main(String[] args) {
	Employee e1=new Employee(101,"a",121.00);
	Employee e2=new Employee(102,"am",1222.00);
	Employee e3=new Employee(101,"a",121.00);
	Employee e4=e1;
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e1.equals(e4));
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);

}
}
