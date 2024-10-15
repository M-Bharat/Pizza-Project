package com.bharat.hibernate.hibernate.pizza.project;



import javax.persistence.Entity;


import com.bharat.entity.Pizza;
import com.bharat.utils.HibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



@Entity

public class ReadPizza 
{
    public static void main( String[] args )
    {

    	SessionFactory sf = HibernateUtils.getSessionFactory();
    	Session session=sf.openSession();
    	
    	session.beginTransaction();
    	
    	Pizza Rp= session.get(Pizza.class, 4);
    	
    	System.out.println(Rp);
    	//to fetch the data we use to get -> entityType-table name; Id- which record
    	
    }
}
