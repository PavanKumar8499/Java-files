package newProject;

import org.checkerframework.checker.units.qual.s;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Eshwar.class).addAnnotatedClass(NewGf.class).configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		
		NewGf gf = new NewGf();
		gf.setId(2);
		gf.setName("xyz");
		ss.save(gf);
		
		Eshwar e = new Eshwar();
		e.setId(2);
		e.setName("omkar");
		e.setGf(gf);
		ss.save(e);
		tt.commit();
		ss.close();
	}
	
}
