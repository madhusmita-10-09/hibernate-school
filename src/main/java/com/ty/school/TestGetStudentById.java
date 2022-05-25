package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//get data by id//
public class TestGetStudentById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager enityManager=entityManagerFactory.createEntityManager();
		Student student=enityManager.find(Student.class,90);
    	if(student!=null)
    	{
		System.out.println("Id is: "+student.getId());
		System.out.println("Name is "+student.getName());
		System.out.println("Percentage is "+student.getPercentage());

	  }
		else System.out.println("No student exist for given id");
	}

}
