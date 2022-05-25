package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateStudentById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Student student=new Student();
		student.setId(4);
		student.setName("soumya");
		student.setPercentage(99.86);
		entityTransaction.begin();
		enityManager.merge(student);
		entityTransaction.commit();
		
		System.out.println("----------done-------");

	}

}
