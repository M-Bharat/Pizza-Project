package com.bharat.hibernate.hibernate.pizza.project;



import com.bharat.entity.Pizza;
import com.bharat.utils.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class Createpizza 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sf = HibernateUtils.getSessionFactory();
    	Session session=sf.openSession();
    	

    	Pizza p= new Pizza();
        p.setSno(58);
        p.setCategory("Non-Veg");
        p.setVariant("Tikka");
        p.setSize("Large");
        p.setCrust("Pan");
        p.setPrice(1050);
    	session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        System.out.println(p);
    }

	
}
