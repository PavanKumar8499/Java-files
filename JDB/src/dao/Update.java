package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	public void update(int id,String name,String Lname,String gmail, String pass) throws Exception {

	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded");

	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	System.out.println("2222");
	PreparedStatement p = c.prepareStatement("update  mydata set psw=?,mailId=?,lastName=?,firstName=? where id=?");
	p.setInt(5, id);
	p.setString(4, name);
	p.setString(3, Lname);
	p.setString(2, gmail);
	
	p.setString(1, pass);
	p.executeUpdate();
	System.out.println("record updated...");
	}
}
