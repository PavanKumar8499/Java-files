package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded...");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		
		System.out.println("2222");
		Statement s = c.createStatement();
		s.executeUpdate("");
		System.out.println("Query inserted...");
	}
}
