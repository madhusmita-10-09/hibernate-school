package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Visitor v=new Visitor();
		
		v.setId(3);
		v.setName("chetan");
		v.setEmail("chetan@gmail.com");
		v.setDob(LocalDate.of(1999,07,7));
		v.setVisitDateTime(LocalDateTime.now());
		v.setGender("male");
		entityTransaction.begin();
		enityManager.persist(v);
		entityTransaction.commit();
		
		System.out.println("----------done-------");
		
		

	}

}
