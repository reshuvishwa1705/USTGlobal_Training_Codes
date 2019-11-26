package com.ustglobal.google.abstraction;

public class TestA {
public static void main(String[] args) {
	Browser b=new Browser();
	Google g1=new Gmail();
	b.operation(g1);
	Google g2=new GoogleDrive();
	b.operation(g2);
}
}
