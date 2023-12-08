package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
//		 Driver Loading
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Driver Loaded");

		Connection c = null;
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2222");

		// statements command

		Statement s = null;
		try {
			s = c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			s.executeUpdate("insert into mydata values(11,'Pavan','Pophale','pophalepavan@gmail.com','Pass@123')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("record inserted...");
		// insert from this side

		try {
			s.executeUpdate("update mydata set firstName ='Shiv', lastName = 'Chandodkar' where id=8");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("record updated...");
		// update cmd from this side

		try {
			s.executeUpdate("delete from mydata where id =1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("record deleted...");
		// delete from this side
		ResultSet r = null;
		try {
			r = s.executeQuery("Select*from mydata");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r);
		try {
			while (r.next()) {
				System.out.println(r.getInt(1) + " " + r.getString(2) + " " + r.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Read from mysql
		try {
			s.executeQuery("update mydata set firstName ='Gopal_Sir', lastName = 'Sing' where id=9");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
