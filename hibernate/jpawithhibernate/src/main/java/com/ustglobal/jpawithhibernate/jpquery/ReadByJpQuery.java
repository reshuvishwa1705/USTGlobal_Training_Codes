package com.ustglobal.jpawithhibernate.jpquery;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class ReadByJpQuery {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*
		 * Query query = entityManager.createQuery("from ProductInfo");
		 * List<ProductInfo> l = query.getResultList(); for (ProductInfo info : l) {
		 * System.out.println("Id is "+info.getPid());
		 * System.out.println("Name is "+info.getPname());
		 * System.out.println("Quantity is "+info.getQuantity());
		 * System.out.println("---------------------------"); }
		 */
	Query query = entityManager.createQuery("select pname from ProductInfo");
	List<String> infos = query.getResultList();
	
	for (String info : infos) {
		System.out.println("Name is "+info);
	}
	entityManager.close();
}//end of main
}//end of class
