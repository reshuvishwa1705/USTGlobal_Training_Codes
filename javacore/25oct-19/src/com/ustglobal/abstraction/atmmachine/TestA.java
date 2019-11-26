package com.ustglobal.abstraction.atmmachine;

public class TestA {

	public static void main(String[] args) {
Machine m=new Machine();
HDFC hd=new HDFC();
ICICI ic=new ICICI();
SBI sbi=new SBI();
m.slot(sbi);
m.slot(ic);
m.slot(hd);
	}

}
