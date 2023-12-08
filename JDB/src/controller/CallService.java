package controller;

import service.CallMethod;
import service.Calldelete;
import service.Callselect;
import service.Callupdate;

public class CallService {
public static void main(String[] args)  {
	//CallMethod c = new CallMethod();
	//c.insert(65,"gjdf","bkiik","gdul","jgdk");
	//c.insert(45,"gjdf","bkiik","gdul","jgdk");
	//Callupdate u=new Callupdate();
	//u.update(11, "gjdjv", "dvih", "vdjo", "vdhki");
	//Calldelete d=new Calldelete();
	//d.delete(20);
	Callselect c=new Callselect();
	try {
		c.select(5);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
