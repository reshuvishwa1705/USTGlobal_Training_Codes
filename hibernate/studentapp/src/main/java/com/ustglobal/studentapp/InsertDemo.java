package com.ustglobal.studentapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.studentapp.dto.StudentInfo;

public class InsertDemo {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		StudentInfo info = new StudentInfo();
		info.setSid(101);
		info.setSname("hornet");
		info.setBranch("cse");
		info.setEmail("hornet@gmail.com");
		System.out.println("Saved Data");
		entityTransaction.begin();
		entityManager.persist(info);
		entityTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}
