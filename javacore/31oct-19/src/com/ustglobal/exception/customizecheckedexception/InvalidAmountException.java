package com.ustglobal.exception.customizecheckedexception;

public class InvalidAmountException extends Exception{
	private String msg="Daily Limit is 40,000";
//	@Override
//	public String toString() {
//		return msg;
//	}
	@Override
	public String getMessage() {
		return msg;
	}
}
