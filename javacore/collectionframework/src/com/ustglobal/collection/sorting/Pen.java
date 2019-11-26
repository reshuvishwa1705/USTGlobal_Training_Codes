package com.ustglobal.collection.sorting;

public class Pen implements Comparable<Pen>{
double price;
String  brand;
String clr;
public Pen(double price, String brand) {
	super();
	this.price = price;
	this.brand = brand;
}

public Pen(double price, String brand, String clr) {
	super();
	this.price = price;
	this.brand = brand;
	this.clr = clr;
}

//@Override
//public int compareTo(Pen o) {
//	// TODO Auto-generated method stub
//	Double d1 = this.price;
//	Double d2 = o.price;
//	return d1.compareTo(d2);
//}
@Override
	public int compareTo(Pen o) {
		return this.brand.compareTo(o.brand);
	}


}
