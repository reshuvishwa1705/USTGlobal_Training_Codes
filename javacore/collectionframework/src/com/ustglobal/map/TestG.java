package com.ustglobal.map;
import java.util.Hashtable;

public class TestG {
public static void main(String[] args) {
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	ht.put(101,"a");
	ht.put(102,"b");
	ht.put(103,"c");
	ht.put(104,"d");
	ht.put(105,"e");
	ht.put(106,"d");
//	ht.put(null,"a"); it does not accept any null key value
//	ht.put(101,null); it does not accept any null value also
	//it will throw NULLPOINTEREXCEPTION
	System.out.println("Data is..."+ht);
	
}
}
