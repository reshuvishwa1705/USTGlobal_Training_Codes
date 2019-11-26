package com.ustglobal.studentapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.studentapp.dto.StudentInfo;

public class ReadDemo {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		StudentInfo info = entityManager.find(StudentInfo.class, 101);
		System.out.println("Id is "+info.getSid());
		System.out.println("Name is "+info.getSname());
		System.out.println("Branch is "+info.getBranch());
		System.out.println("Email is "+info.getEmail());
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}//end of main method
}//end of class
