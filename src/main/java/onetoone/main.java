package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {
   public static void main(String[] args) {
	   SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       
       question q1 = new question();
       q1.setQ_id(1);
       q1.setQuestion("what is java...?");
       
       question q2 = new question();
       q2.setQ_id(2);
       q2.setQuestion("what is pyathn...?");
       
       
       
       answer a1 = new answer();
       a1.setA_id(1);
       a1.setAnswer("high level");
       
       answer a2 = new answer();
       a2.setA_id(2);
       a2.setAnswer("DS,WD");
       
      q1.setAns_id(a1);
      q2.setAns_id(a2);
      
      a1.setQue_id(q1);
      a2.setQue_id(q2);
       
      session.save(q1);
      session.save(q2);
      session.save(a1);
      session.save(a2);
       
       
       
       
       
       
       tx.commit();
       session.close();
       sf.close();
}
}
