package com.ustglobal.singletonclass;

public class TestMySingleton {
	public static void main(String[] args) {
		MySingleton ms=MySingleton.getDbConnection();
		int hs=ms.hashCode();
		System.out.println("Hashcode of ms-" +hs);
		ms.s="hi";
		MySingleton ms1=MySingleton.getDbConnection();
		System.out.println("Hashcode of ms1-"+ms1.hashCode());
		ms1.s="hello";
		System.out.println(ms.s);
		System.out.println(ms1.s);

	}
}
