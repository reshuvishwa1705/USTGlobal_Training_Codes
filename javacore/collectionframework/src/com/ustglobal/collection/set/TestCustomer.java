package com.ustglobal.collection.set;
import java.util.Iterator;
import java.util.TreeSet;
public class TestCustomer {
public static void main(String[] args) {
	Customer c1 = new Customer("y",101,56000);
	Customer c2 = new Customer("r",102,56040);
	Customer c3 = new Customer("s",103,56540);
	Customer c4 = new Customer("f",104,56020);
	CustomerSortByName sn = new CustomerSortByName();
	TreeSet<Customer> ts = new TreeSet<Customer>(sn);
	ts.add(c3);
	ts.add(c2);
	ts.add(c4);
	ts.add(c1);
	Iterator<Customer> it = ts.iterator();
	System.out.println("********USING FOR ITERATOR************");
	while (it.hasNext()) {
		Customer c = (Customer) it.next();
		System.out.println("Name is "+c.name);
		System.out.println("Id is "+c.id);
		System.out.println("Salary is "+c.sal);
		System.out.println("---------------------");
	}
}
}
