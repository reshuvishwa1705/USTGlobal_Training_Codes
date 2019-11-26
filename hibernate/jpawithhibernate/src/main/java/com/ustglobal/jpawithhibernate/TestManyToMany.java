package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Course;
import com.ustglobal.jpawithhibernate.manytomany.StudentC;

public class TestManyToMany {

	public static void main(String[] args) {
		Course course = new Course();
		course.setCid(101);
		course.setCname("Java");
		Course course1 = new Course();
		course1.setCid(102);
		course1.setCname("SQL");
		Course course2 = new Course();
		course2.setCid(103);
		course2.setCname("Angular");
		Course course3 = new Course();
		course3.setCid(104);
		course3.setCname("Spring");
		StudentC studentC = new StudentC();
		studentC.setSid(1);
		studentC.setSname("Reshu");
		List<Course> l = new ArrayList<Course>();
		l.add(course);
		l.add(course1);
		studentC.setCourses(l);
		StudentC studentC1 = new StudentC();
		studentC1.setSid(2);
		studentC1.setSname("Annu");
		List<Course> l1 = new ArrayList<Course>();
		l1.add(course2);
		l1.add(course3);
		studentC1.setCourses(l1);
		StudentC studentC2 = new StudentC();
		studentC2.setSid(3);
		studentC2.setSname("Pinka");
		List<Course> l2= new ArrayList<Course>();
		l2.add(course3);
		l2.add(course1);
		studentC2.setCourses(l2);
	
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			/*
			 * entityManager.persist(studentC); entityManager.persist(studentC1);
			 * entityManager.persist(studentC2); System.out.println("Record Saved");
			 */
			Course course4 = entityManager.find(Course.class, 104);
			List<StudentC> ll = course4.getStudentCs();
			for (StudentC studentC3 : ll) {
				System.out.println("Student id is "+studentC3.getSid());
				System.out.println("Student name is "+studentC3.getSname());
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
