package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Student s=new Student();
		s.setId(4);
		s.setName("soumya");
		s.setPercentage(54.86);
		entityTransaction.begin();
		enityManager.persist(s);
		entityTransaction.commit();
		
		System.out.println("----------done-------");
		
		
		
		
		
		}

}
