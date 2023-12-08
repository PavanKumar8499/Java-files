package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

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

	public void update() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		System.out.println("2222");
		// statements command
		Statement s = c.createStatement();
		s.executeUpdate("update mydata set firstName ='Geeta' where id=1");
		System.out.println("record updated...");
//		 update cmd from this side

	}

	public void delete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
//		System.out.println("2222");
		// statements command
		Statement s = c.createStatement();
		s.executeUpdate("delete from mydata where id =4");
		System.out.println("record deleted...");
		// delete from this side
	}


	public static void main(String[] args) throws Exception {

//		 Driver Loading
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		System.out.println("2222");

		// statements command

		Statement s = c.createStatement();
		s.executeUpdate("insert into mydata values(8,'Pavan','Pophale','pophale8499@gmail.com','Pass@123')");
		System.out.println("record inserted...");
		// insert from this side

		s.executeUpdate("update mydata set firstName ='Shiv', lastName = 'Chandodkar' where id=8");
		System.out.println("record updated...");
		// update cmd from this side

		s.executeUpdate("delete from mydata where id =1");
		System.out.println("record deleted...");
		// delete from this side
		ResultSet r=s.executeQuery("Select*from mydata");
		System.out.println(r);
		while(r.next()) {
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
		}
		// Read from mysql
	}
}
