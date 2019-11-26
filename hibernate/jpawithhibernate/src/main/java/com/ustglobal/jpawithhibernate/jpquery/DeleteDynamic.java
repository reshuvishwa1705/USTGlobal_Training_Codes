package com.ustglobal.jpawithhibernate.jpquery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamic {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("delete from ProductInfo where pid=:id");
		query.setParameter("id", 102);
		System.out.println(query.executeUpdate()+" Rows deleted");
		entityTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}//end of main
}//end of class