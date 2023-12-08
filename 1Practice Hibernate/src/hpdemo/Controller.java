package hpdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.addAnnotatedClass(LetsTry.class).configure();
	
	SessionFactory sf= cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction t = ss.beginTransaction();
	LetsTry lt = new LetsTry(101,"si","hi");
	ss.save(lt);
	System.out.println("Record Inserted");
	t.commit();
	ss.close();
	
}
}
