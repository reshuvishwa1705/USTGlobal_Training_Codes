package com.ustglobal.exception.unchecked;
public class Paytm {
void book() {
	System.out.println("Paytm Started");
	IRCTC ir=new IRCTC();
	ir.confirm();
	System.out.println("Paytm Ended");
}
}
