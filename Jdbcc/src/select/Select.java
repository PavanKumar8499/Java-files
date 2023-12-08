package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
public void select() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded...");
	
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	Statement s =c.createStatement();
	
	ResultSet r = s.executeQuery("Select *from mydata");
	System.out.println(r);
	while (r.next()) {
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
	}
}
}
