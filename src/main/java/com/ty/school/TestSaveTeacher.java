package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class TestSaveTeacher {

			public static void main(String[] args) {
				EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
				EntityManager enityManager=entityManagerFactory.createEntityManager();
				EntityTransaction entityTransaction=enityManager.getTransaction();
				
				Teacher t=new Teacher();
				t.setId(3);
				t.setName("sufiyan");
				t.setEmail("sufiyan@gmail.com");
				t.setPhone(998774558l);
				t.setGender("male");
				
				entityTransaction.begin();
				enityManager.persist(t);
				entityTransaction.commit();
				
				System.out.println("----------done-------");
				
				
				
				
				
				}

	}


