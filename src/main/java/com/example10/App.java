package com.example10;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.example10.model.Product;
import com.example10.model.Cast;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try 
        {
        session.beginTransaction();
       Product pro1=new Product();
        pro1.setName("Movie");
        Product pro2=new Product();
        pro2.setName("Electronics");
        
        Cast c1=new Cast();
        c1.setCastName("Actor");
        Cast c2=new Cast();
        c2.setCastName("AC");
        
       pro1.getCast().add(c1);
       pro1.getCast().add(c2);
       pro2.getCast().add(c2);
        
        session.save(pro1);
        session.save(pro2);
        session.save(c1);
        session.save(c2);
        session.getTransaction().commit();
        }
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }    
    }
}
