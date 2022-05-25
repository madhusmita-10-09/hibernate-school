package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitorById {
//get data by id//
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		Visitor visitor=enityManager.find(Visitor.class,2);
		if(visitor!=null)
		{
		System.out.println("Id is: "+visitor.getId());
		System.out.println("Name is "+visitor.getName());
		System.out.println("Email is "+visitor.getEmail());
		System.out.println("DOB is: "+visitor.getDob());
		System.out.println("Visit date time: "+visitor.getVisitDateTime());
		System.out.println("Gender is: "+visitor.getGender());

	  }
		else System.out.println("No Visitor exist for given Id");
	}

	}


