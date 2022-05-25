package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		 Parent parent=new Parent();
		 parent.setName("madhu");
		 parent.setPhone(87654398l);
		 parent.setEmail("madhu@gmail.com");
		 
		 entityTransaction.begin();
			enityManager.persist(parent);
			entityTransaction.commit();
			
			System.out.println("----------done-------");
			
		 
		 
		 
	}

}
