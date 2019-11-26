package com.ustglobal.jpawithhibernate.jpquery;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamic {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		Scanner sc = new Scanner(System.in);
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Query query = entityManager.createQuery("update ProductInfo set pname=:name where pid=:id");
			/*
			 * query.setParameter("name", "Notebook"); query.setParameter("id", 101);
			 */
			System.out.println("Enter updated name");
			query.setParameter("name",sc.next());
			System.out.println("Enter id ");
			query.setParameter("id", sc.nextInt());
			System.out.println(query.executeUpdate()+" Rows updated");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
