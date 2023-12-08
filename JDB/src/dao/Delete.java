package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
public void delete(int id) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded");

	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	System.out.println("2222");
	PreparedStatement p = c.prepareStatement("delete from mydata  where id=?");
	p.setInt(1, id);
	p.executeUpdate();
	System.out.println("record delete");
}
}
