package com.ustglobal.collection.sorting;

public class Laptop implements Comparable<Laptop>{
	String name;
	double price;
	int RAM;
	public Laptop(String name, double price, int RAM) {
		super();
		this.name = name;
		this.price = price;
		this.RAM = RAM;
	}
//	@Override
//	public int compareTo(Laptop o) {
//		Integer i = this.RAM;
//		Integer j = o.RAM;
//		return i.compareTo(j);
//	}
//	
//	@Override
//	public int compareTo(Laptop o) {
//		Double i = this.price;
//		Double j = o.price;
//		return i.compareTo(j);
//	}
	@Override
	public int compareTo(Laptop o) {
	
		return this.name.compareToIgnoreCase(o.name);
	}
}
