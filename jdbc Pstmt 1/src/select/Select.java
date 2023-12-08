package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root", "root");
	Statement s = c.createStatement();
	ResultSet r  =s.executeQuery("select *from employees");
	while(r.next()) {
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
	}
	System.out.println("Query Inserted...");
}
}
