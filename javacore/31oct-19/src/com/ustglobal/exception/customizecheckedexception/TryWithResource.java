package com.ustglobal.exception.customizecheckedexception;

import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(Scanner sc1=new Scanner(System.in);
				Scanner sc2=new Scanner(System.in);){
			System.out.println("Enter Age");
			int age=sc1.nextInt();
			System.out.println("Age "+age);
			System.out.println("Enter num");
			System.out.println(sc2.nextInt());
			System.out.println(age/0);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("finally executed");
		}
		
	}
	

}
