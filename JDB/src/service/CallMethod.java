package service;

import dao.Insert;

public class CallMethod {
	public void insert(int id,String name,String Lname,String gmail, String pass) throws Exception {
		Insert i = new Insert();
		i.insert( id, name, Lname, gmail,  pass);
	}
}
