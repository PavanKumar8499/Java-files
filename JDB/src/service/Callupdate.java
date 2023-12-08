package service;

import dao.Update;

public class Callupdate {
	public void update(int id,String name,String Lname,String gmail, String pass) throws Exception {
		Update u=new Update();
		u.update(id, name, Lname, gmail, pass);
	}

}
