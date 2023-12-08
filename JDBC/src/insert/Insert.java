package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public void insert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
//		System.out.println("2222");
		// statements command
		Statement s = c.createStatement();
		s.executeUpdate("insert into mydata values(4,'Pavan','Pophale','pophale8499@gmail.com','Pass@123')");
		System.out.println("record inserted...");
		// insert from this side
	}
}
