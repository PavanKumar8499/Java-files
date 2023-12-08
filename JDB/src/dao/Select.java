package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
	 public void select(int id) throws Exception {
		 Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			System.out.println("2222");
			PreparedStatement p = c.prepareStatement("select * from mydata where id=?");
			p.setInt(1,id);
			ResultSet r=p.executeQuery();
			while(r.next()) {
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4)+" "+r.getString(5));
			}
			
		
	}

}
