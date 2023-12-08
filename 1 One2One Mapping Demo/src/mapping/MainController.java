package mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainController {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(NewClass.class).addAnnotatedClass(Address.class).configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tt = ss.beginTransaction();
		
		Address a = new Address();
		a.setName("Pune");
		ss.save(a);
		NewClass e = new NewClass();
		e.setEname("Pavan");
		e.setAdd(a);
		ss.save(e);
		
		
		System.out.println("Record Inserted ....."+e);

		tt.commit();
		ss.close();
		
	}
}
