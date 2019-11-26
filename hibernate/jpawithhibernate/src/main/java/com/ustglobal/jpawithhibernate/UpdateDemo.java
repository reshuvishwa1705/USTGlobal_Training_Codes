package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
     try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			ProductInfo info = entityManager.find(ProductInfo.class, 101);
			info.setPname("Mobile");
			System.out.println("Updated Record");
			entityTransaction.commit();
		} 
		catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
     finally {
    	 entityManager.close();
	}
		

	}//end of main method
}//end of class
