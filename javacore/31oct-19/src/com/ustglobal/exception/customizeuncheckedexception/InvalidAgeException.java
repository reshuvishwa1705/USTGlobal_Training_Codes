package com.ustglobal.exception.customizeuncheckedexception;

public class InvalidAgeException extends RuntimeException {
	private String msg="Invalid age below 18 years not allowed";
//	@Override
//	public String toString() {
//		return msg;
//	}
	@Override
	public String getMessage() {
		return msg;
	}
	public InvalidAgeException() {

	}
	public InvalidAgeException(String msg) {
		this.msg=msg;
	}
}
