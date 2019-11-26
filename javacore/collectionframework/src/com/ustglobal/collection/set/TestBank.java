package com.ustglobal.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {
public static void main(String[] args) {
	BankSortByName sn = new BankSortByName();
	BankSortByMICR sm = new BankSortByMICR();
	BankSortByPincode sp = new BankSortByPincode();
	TreeSet<Bank> ts = new TreeSet<Bank>(sp);
	Bank b1 = new Bank("SBI",321532, 21654685);
	Bank b2 = new Bank("HDFC",345115, 22332112);
	Bank b3 = new Bank("ICICI",211515, 12112212);
	Bank b4 = new Bank("PNB",623323,32203521);
	Bank b5 = new Bank("PNB",623323,32203521);
	
	ts.add(b2);
	ts.add(b1);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	Iterator<Bank> it = ts.iterator();
	System.out.println("********USING FOR ITERATOR************");
	while (it.hasNext()) {
		Bank b = (Bank) it.next();
		System.out.println("Name is "+b.name);
		System.out.println("Pincode is "+b.pincode);
		System.out.println("MICR is "+b.micr);
		System.out.println("---------------------");
	}

	
}
}
