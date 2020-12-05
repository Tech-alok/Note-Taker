package com.Entities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factoryconnection {
	
	public static SessionFactory factory;
	public static SessionFactory getFactory()
	{
		if(factory==null)
		{
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
	
	public void closeFactory()
	{
		if(factory.isOpen())
		{
			factory.close();
		}
	}

}
