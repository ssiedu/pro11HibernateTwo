package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;

public class SearchStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number Of The Student To Be Searched: ");
		int rno=sc.nextInt();
		Session session=Data.getSF().openSession();
		Student student=session.get(Student.class, rno);
		//System.out.println(student);
		if(student!=null){
		System.out.println(student.getRno());
		System.out.println(student.getName());
		System.out.println(student.getBranch());
		System.out.println(student.getSem());
		}else{
			System.out.println("Invalid Roll Number");
		}
		session.close();

	}

}
