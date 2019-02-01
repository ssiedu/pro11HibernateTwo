package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentEntry {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rno=sc.nextInt();
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Branch : ");
		String branch=sc.next();
		System.out.println("Enter Semester : ");
		int sem=sc.nextInt();
		
		//create an entity object
		Student student=new Student(rno,name,branch,sem);
		/*student.setRno(rno);
		student.setName(name);
		student.setBranch(branch);
		student.setSem(sem);*/
		
		//create an Configuration object
		Configuration config=new Configuration().configure();
		//create an SessionFactory object
		SessionFactory factory=config.buildSessionFactory();
		//create an Session object
		Session session=factory.openSession();
		//begin the transaction
		Transaction tr=session.beginTransaction();
		//call the save method
		session.save(student);
		//commit the transaction
		tr.commit();
		//close the session
		session.close();
		System.out.println("DATA STORED SUCCESSFULLY");
		
	}

}
