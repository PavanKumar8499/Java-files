package queryNdCriteria;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class ControllerMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Q.class).configure();
		System.out.println("hiiii");

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		Q qc = new Q(1, 6, 123, "Shivam", "Chandodkar");
		
		ss.save(qc);
		System.out.println(qc);
		tt.commit();
		ss.close();
		
	}
}
