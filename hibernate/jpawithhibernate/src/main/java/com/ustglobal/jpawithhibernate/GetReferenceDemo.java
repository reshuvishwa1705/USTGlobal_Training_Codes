package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class GetReferenceDemo {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		ProductInfo info = entityManager.getReference(ProductInfo.class, 101);
		System.out.println("Id is "+info.getPid());
		System.out.println("Name is "+info.getPname());
		System.out.println("Quantity is "+info.getQuantity());
		entityTransaction.commit();
		
	entityManager.close();
}
}
