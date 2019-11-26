package com.ustglobal.jpawithhibernate.jpquery;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class InsertDynamic {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Query query = entityManager.createQuery("insert into ProductInfo values(:pid,:pname,:quantity)");
			query.setParameter("pid", 102);
			query.setParameter("pname", "Notebook");
			query.setParameter("quantity", 20);
			System.out.println(query.executeUpdate()+" Rows updated");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}


