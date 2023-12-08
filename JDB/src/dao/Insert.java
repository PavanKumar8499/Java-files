package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Insert {
public void insert(int id,String name,String Lname,String gmail, String pass) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded");

	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	System.out.println("2222");
	PreparedStatement p = c.prepareStatement("insert into mydata values(?,?,?,?,?)");
	p.setInt(1, id);
	p.setString(2, name);
	p.setString(3, Lname);
	p.setString(4, gmail);
	
	p.setString(5, pass);
	p.executeUpdate();
	System.out.println("record inserted...");
	
	
}
}
