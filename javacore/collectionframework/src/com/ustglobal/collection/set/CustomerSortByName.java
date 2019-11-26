package com.ustglobal.collection.set;
import java.util.Comparator;

public class CustomerSortByName implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.name.compareToIgnoreCase(o2.name);
	}

}
