package one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Mobile.class).addAnnotatedClass(Name.class).configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		
		Name n = new Name();
		n.setId(1);
		n.setMob(123);
		ss.save(n);
		
		Mobile m = new Mobile();
		m.setId(1);
		m.setfName("Pavan");
		m.setLname(n);
		ss.save(m);
		tt.commit();
		ss.close();
	}
}
