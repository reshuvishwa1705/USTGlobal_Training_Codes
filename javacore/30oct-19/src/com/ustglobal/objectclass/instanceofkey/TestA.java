package com.ustglobal.objectclass.instanceofkey;

public class TestA {

	public static void main(String[] args) {
		PenDrive pd=new PenDrive();
		USBPort.connect(pd);
		Mouse m=new Mouse();
		USBPort.connect(m);
	}

}
