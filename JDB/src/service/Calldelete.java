package service;

import dao.Delete;

public class Calldelete {
public void delete(int id) throws Exception {
	Delete d=new Delete();
	d.delete(id);
	
}
}
