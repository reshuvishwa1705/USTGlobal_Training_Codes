package com.ustglobal.singletonclass;

public class MySingleton {
private static MySingleton instance=null;
String s="*********";
public static MySingleton getDbConnection() {
	if(instance==null) {
		instance=new MySingleton();
		return instance;
	}
	else
		return instance;
}
}
