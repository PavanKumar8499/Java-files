package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	
public void insert () throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1111XX");
	
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");

	Statement s =c.createStatement();
	s.executeUpdate("insert into mydata values(6, 'Mayur','Kolapkar', 'mayur@gmail.com', 'Pass@123')");
	System.out.println("record inserted...");
}
}
