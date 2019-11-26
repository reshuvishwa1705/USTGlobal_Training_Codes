package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.Angular;
import com.ustglobal.studentapp.jspiders.React;

public class TestA {

	public static void main(String[] args) {
		QTp qtp=new QTp();
		qtp.teachQTp();
		System.out.println("++++++++++++++++++++");
		Selenium s=new Selenium();
		s.teachSelenium();
		System.out.println("********************");
		System.out.println("____________________");
		Angular a=new Angular();
		a.teachAngular();
		System.out.println("+++++++++++++++++++++");
		React r=new React();
		r.teachReact();
	}

}
