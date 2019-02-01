package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class RemoveStudentRecord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number Of The Student To Be Deleted: ");
		int rno=sc.nextInt();
		
		Student student=new Student();
		student.setRno(rno);
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.delete(student);
		tr.commit();
		
		session.close();
		
		System.out.println("RECORD SUCCESSFULLY REMOVED");

	}
}
