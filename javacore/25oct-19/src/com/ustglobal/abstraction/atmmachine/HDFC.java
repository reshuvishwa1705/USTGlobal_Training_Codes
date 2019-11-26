package com.ustglobal.abstraction.atmmachine;

public class HDFC implements ATM{

	@Override
	public void validateCard() {
		System.out.println("Hdfc validateCard()");
	}

	@Override
	public void getInfo() {
	System.out.println("Hdfc getInfo() ");
		
	}

}
