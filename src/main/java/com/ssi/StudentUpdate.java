package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentUpdate {

	public static void main(String[] args) {
		
		Session session=Data.getSF().openSession();
		//fetch the object to be modified
		Student s=session.get(Student.class, 113);
		s.setBranch("Elex");
		Transaction tr=session.beginTransaction();
		session.update(s);
		tr.commit();
		System.out.println("RECORD MODIFIED");

	}

}
