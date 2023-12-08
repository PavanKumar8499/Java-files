package schoolDAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import schoolPojo.Pojo;

public class InsertD {

	public void insert () {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Pojo.class).configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction t = ss.beginTransaction();
		
	}
}
