package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelectVisitorById {

	public static void main(String[] args) {
      
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Visitor visitor=enityManager.find(Visitor.class,2);
		
		if(visitor!=null)
		{
			entityTransaction.begin();
			enityManager.remove(visitor);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("No record to deelect");
		}
	}
	}

