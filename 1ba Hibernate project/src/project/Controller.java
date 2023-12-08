package project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.addAnnotatedClass(QcTable.class).configure();
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tt = ss.beginTransaction();
	QcTable qt1 = new QcTable(1, 6, "Shivam", "Chandodkar", "CSN");
	QcTable qt2 = new QcTable(2, 5, "Rutu", "Shingare", "Jalna");
	QcTable qt3 = new QcTable(3, 3, "Samu", "Kolpkar", "Pune");
	QcTable qt4 = new QcTable(4, 2, "Adu", "Shingare", "Jalna");
	QcTable qt5 = new QcTable(5, 0, "Adwait", "Chandodkar", "CSN");
	
	ss.save(qt1);
	ss.save(qt2);
	ss.save(qt3);
	ss.save(qt4);
	ss.save(qt5);

	tt.commit();
	ss.close();
}

} 
