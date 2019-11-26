package com.ustglobal.exception.customizecheckedexception;

public class Validate {
void checkAmount(int amt) throws InvalidAmountException {
	if(amt>40000) {
		throw new InvalidAmountException();
	}
}
}
