package com.bharat.utils;

import com.bharat.entity.Pizza;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Configuration configuration=new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Pizza.class);
    	
    	SessionFactory sf=configuration.buildSessionFactory();
		return sf;
	}
}
