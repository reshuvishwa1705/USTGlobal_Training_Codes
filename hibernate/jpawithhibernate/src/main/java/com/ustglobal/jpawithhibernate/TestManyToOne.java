package com.ustglobal.jpawithhibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.Pencil;
import com.ustglobal.jpawithhibernate.onetomany.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		PencilBox pencilBox = new PencilBox();
		pencilBox.setBid(11);
		pencilBox.setBname("NatrajBox");
		Pencil pencil = new Pencil();
		pencil.setPid(10);
		pencil.setColor("red");
		pencil.setBox(pencilBox);
		Pencil pencil2 = new Pencil();
		pencil2.setPid(20);
		pencil2.setColor("black");
		pencil2.setBox(pencilBox);
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			/*
			 * entityManager.persist(pencil); entityManager.persist(pencil2);
			 * System.out.println("Record Saved");
			 */
			PencilBox pencilBox2 = entityManager.find(PencilBox.class, 11);
			//		System.out.println(pencilBox2.getPencil().get(10));
			//		System.out.println(pencilBox2.getPencil().get(20));
			List<Pencil> l = pencilBox2.getPencil();
			for(Pencil p : l) {

				System.out.println("Pencil id is "+p.getPid());
				System.out.println("Pencil Name is "+p.getColor());
				System.out.println("-----------------------");
			}


			entityTransaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		finally {
			entityManager.close();
		}
	}
}
