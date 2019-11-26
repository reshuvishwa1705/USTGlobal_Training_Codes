package com.ustglobal.collection.set;

import java.util.Comparator;

public class BankSortByPincode implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Integer i1 = o1.pincode;
		Integer i2 = o2.pincode;
		return i1.compareTo(i2);
	}

}
