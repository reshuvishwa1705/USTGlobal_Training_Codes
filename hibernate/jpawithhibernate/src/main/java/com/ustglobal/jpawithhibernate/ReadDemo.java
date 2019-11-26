package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductInfo info = entityManager.find(ProductInfo.class, 101);
		System.out.println("Id is "+info.getPid());
		System.out.println("Name is "+info.getPname());
		System.out.println("Quantity is "+info.getQuantity());
	}//end of main method

}//end of class
