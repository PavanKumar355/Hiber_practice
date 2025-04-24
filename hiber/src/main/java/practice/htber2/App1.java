package practice.htber2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import practice.htber2.Employee;

public class App1
{
	public static void main( String[] args )
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();

		Person p = new Person();
		AadharCard ac = 
				new AadharCard(1111,"deep","btm","male",p);
        p.setId(101);
        p.setNickname("alice");
        p.setCard(ac);
		
		sess.persist(p);
		sess.persist(ac);
		sess.getTransaction().commit();
	}
}