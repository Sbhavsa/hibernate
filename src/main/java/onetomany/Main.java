package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	 public static void main(String[] args) {
		 SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	       Session session = sf.openSession();
	       Transaction tx = session.beginTransaction();
	       
	       tx.commit();
	       session.close();
	       sf.close();
	 }
}
