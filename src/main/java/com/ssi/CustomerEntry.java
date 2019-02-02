package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerEntry {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		
		Address adr1=new Address(501,"ABRoad","Indore");
		Customer c1=new Customer();
		c1.setCode("C111");
		c1.setCname("ABC");
		c1.setCaddress(adr1);
		
		Address adr2=new Address(555,"MGRoad","Bhopal");
		Customer c2=new Customer("C112","XYZ",adr2);
		
		Customer c3=new Customer("C113","PQR", new Address(601,"PRoad","Indore"));
		
		Transaction tr=session.beginTransaction();
		session.save(c1); session.save(c2); session.save(c3);
		tr.commit();
		session.close();
		
		System.out.println("DATA STORED");
		
		
	}

}
