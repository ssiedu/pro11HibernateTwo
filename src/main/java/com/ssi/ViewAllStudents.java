package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class ViewAllStudents {

	public static void main(String[] args) {
		Session session=Data.getSF().openSession();
		Criteria cr=session.createCriteria(Student.class);
		List<Student> students=cr.list();
		
		for(Student stud:students){
			System.out.println(stud);
		}
		
		session.close();
	}

}
