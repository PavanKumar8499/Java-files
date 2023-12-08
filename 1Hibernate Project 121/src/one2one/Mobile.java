package one2one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
	private int id ;
	private String fName ;
	@OneToOne
	private Name lname ;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int id, String fName, Name lname) {
		super();
		this.id = id;
		this.fName = fName;
		this.lname = lname;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lname
	 */
	public Name getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(Name lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", fName=" + fName + ", lname=" + lname + "]";
	}
	
	
	
}
