package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;
import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {
		VoterCard vCard = new VoterCard();
		vCard.setName("Ram");
		vCard.setVid(10);
		Person person = new Person();
		person.setPid(1);
		person.setName("Ram");
		person.setVoterCard(vCard);
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(person);
			VoterCard v = entityManager.find(VoterCard.class, 10);
			System.out.println("Id is "+v.getPerson().getPid());
			System.out.println("Name is "+v.getPerson().getName());
			
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
