package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetTeacherById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager = entityManagerFactory.createEntityManager();
		Teacher teacher = enityManager.find(Teacher.class, 2);
		if (teacher != null) {
			System.out.println("Id is: " + teacher.getId());
			System.out.println("Name is " + teacher.getName());
			System.out.println("Email is " + teacher.getEmail());
			System.out.println("Phone  is: " + teacher.getPhone());
			System.out.println("Gender is: " + teacher.getGender());

		} else
			System.out.println("No Techer exist for given Id");
		{

		}
	}

}
