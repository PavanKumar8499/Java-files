package genZ;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Controller {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(FamilyTable.class).configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		System.out.println("welcome to my family :) ");
		Query q =ss.createQuery("from FamilyTable");
		List<FamilyTable> list = q.list();
		 
		for (FamilyTable ft : list) {
			System.out.println(ft.getId()+" "+ft.getfName()+" "+ft.getlName()+" "+ft.getCity()+" "+ft.getClass()+" "+ft.getEducation());
		}
		ss.close();
		 
		// to see single records use this
		
		
		
//		Transaction t = ss.beginTransaction();
//		FamilyTable sw = new FamilyTable(5, "Adwait", "Chandodkar", "3mnth", "CSN");
//		ss.save(sw);
//		t.commit();
//		ss.close();
//		System.out.println(sw);
//		System.out.println("Record Inserted...");
		
	}
}
