package hibernatePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TableController {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(NewTable.class).configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
		NewTable nt = new NewTable(6,"Geeta","Chandodkar");
		ss.save(nt);
		t.commit();
		System.out.println(nt);
		ss.close();
	}
}
