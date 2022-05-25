package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacherById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=enityManager.getTransaction();
		
		Teacher teacher=new Teacher();
		teacher.setId(3);
		teacher.setName("sufiyan");
		teacher.setEmail("sufiyan756@gmail.com");
		teacher.setPhone(998774558l);
		teacher.setGender("male");
		
		entityTransaction.begin();
		enityManager.merge(teacher);
		entityTransaction.commit();
		
		System.out.println("----------done-------");

	}

}
