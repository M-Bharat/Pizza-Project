package com.bharat.hibernate.hibernate.pizza.project;



import javax.persistence.Entity;


import com.bharat.entity.Pizza;
import com.bharat.utils.HibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@Entity

public class UpdatePizza 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sf = HibernateUtils.getSessionFactory();
    	Session session=sf.openSession();
    	

    	
    	Pizza Up= session.get(Pizza.class, 2);
        Up.setSno(2);
        //Up.setCategory("");
        //Up.setVariant("");
        Up.setSize("Large");
        //Up.setCrust("");
        //Up.setPrice(0);
        
    	session.beginTransaction();
        session.update(Up);
        session.getTransaction().commit();
        System.out.println(Up);
    }
}
