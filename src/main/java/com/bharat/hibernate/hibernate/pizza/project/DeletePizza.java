package com.bharat.hibernate.hibernate.pizza.project;



import javax.persistence.Entity;


import com.bharat.entity.Pizza;
import com.bharat.utils.HibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@Entity

public class DeletePizza 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sf = HibernateUtils.getSessionFactory();
    	Session session=sf.openSession();
    	
    	Pizza Dp= session.get(Pizza.class, 8);
        
    	session.beginTransaction();
        session.delete(Dp);
        session.getTransaction().commit();
        System.out.println(Dp);
    }
}
