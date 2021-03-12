package com.ltts.TestHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg=new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
      Employee e=new Employee();
      e.setEmpid(101);
      e.setEmpname("Teja");
      e.setEmpaddress("Mysore");
      t.commit();
      session.save(e);
      factory.close();
      session.close();
    }
}
