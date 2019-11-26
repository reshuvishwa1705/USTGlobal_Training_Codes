package com.ustglobal.collection.set;

import java.util.Comparator;

public class BankSortByName implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		
		return o1.name.compareToIgnoreCase(o2.name);
	}

}
