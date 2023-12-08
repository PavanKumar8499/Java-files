package service;

import dao.Select;

public class Callselect {
public void select(int id) throws Exception {
	Select s=new Select();
	s.select(id);
}
}
