package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class Reattaching {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		ProductInfo info = entityManager.find(ProductInfo.class, 10);
		System.out.println(entityManager.contains(info));
		entityManager.detach(info);
		System.out.println(entityManager.contains(info));
		ProductInfo info2 = entityManager.merge(info);
		info2.setPname("color pen");
		info2.setQuantity(10);
		System.out.println("Updated record");
		entityTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}//end of Main method
}//end of class
