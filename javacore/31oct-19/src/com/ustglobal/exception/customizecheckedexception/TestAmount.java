package com.ustglobal.exception.customizecheckedexception;

public class TestAmount {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Validate v=new Validate();
		try {
			v.checkAmount(65000);
			System.out.println("Withdraw your cash");
		} catch (InvalidAmountException e) {

			System.err.println(e.getMessage());
		}
		System.out.println("Main End");
	}

}
