package demo;

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
        System.out.println( "Hello World!" );
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
  //    User u = new User (1,"snehal","ahmedabad");
   //     session.save(u);
      
        
     //   User u = session.get(User.class, 3);
	//	System.out.println(u);
		
		User u = new User(1,"snehal","uk");
		session.update(u);
        
        
        tx.commit();
        session.close();
        sf.close();
    }
}
