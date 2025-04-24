package practice2.hiber2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory sf = cfg.buildSessionFactory();
         Session sess = sf.openSession();
         sess.beginTransaction();
         
         Employee e = new Employee("anil",40000,"hr","finance");
          sess.persist(e);
           sess.getTransaction().commit();   

    }
}
