package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateVisitorById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Visitor visitor=new Visitor();
		
		visitor.setId(3);
		visitor.setName("chetan");
		visitor.setEmail("chetan546@gmail.com");
		visitor.setDob(LocalDate.of(1999,07,7));
		visitor.setVisitDateTime(LocalDateTime.now());
		visitor.setGender("male");
		entityTransaction.begin();
		enityManager.merge(visitor);
		entityTransaction.commit();
		
		System.out.println("----------done-------");
		
		

	}

}
