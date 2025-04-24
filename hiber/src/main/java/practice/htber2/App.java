package practice.htber2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    Configuration cfg = new Configuration();
    cfg.configure();
    SessionFactory	factory=cfg.buildSessionFactory();
    Session ses = factory.openSession();
    
    Student st = ses.get(Student.class, 3);
   // st.setYop(2021);
    
    Transaction tx = ses.beginTransaction();
   // ses.persist(st);
    ses.remove(st);
    tx.commit();
    System.out.println(st); // deleted object : Student [kodId-3, name - alice, yop - 2034, address- silkboard
    }
}
