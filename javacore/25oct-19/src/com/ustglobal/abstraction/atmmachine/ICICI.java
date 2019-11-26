package com.ustglobal.abstraction.atmmachine;

public class ICICI implements ATM{

	@Override
	public void validateCard() {
		System.out.println("Icici validateCard()");
	}

	@Override
	public void getInfo() {
System.out.println("Icici getInfo()");		
	}

}
