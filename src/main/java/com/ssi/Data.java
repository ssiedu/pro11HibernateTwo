package com.ssi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Data {
public static SessionFactory getSF(){
	Configuration config=new Configuration().configure();	
	SessionFactory factory=config.buildSessionFactory();
	return factory;
}
}
