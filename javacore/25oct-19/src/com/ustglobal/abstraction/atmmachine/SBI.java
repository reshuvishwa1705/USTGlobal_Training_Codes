package com.ustglobal.abstraction.atmmachine;

public class SBI implements ATM{

	@Override
	public void validateCard() {
		System.out.println("SBI validateCard()");
	}

	@Override
	public void getInfo() {
	System.out.println("SBI getInfo()");	
	}

}
