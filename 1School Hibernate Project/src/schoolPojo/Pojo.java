package schoolPojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pojo {
@Id
	private int id;
	private String fName;
	private String lName;
	private String mob;
	private String mail;
	public Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pojo(int id, String fName, String lName, String mob, String mail) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.mob = mob;
		this.mail = mail;
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
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the mob
	 */
	public String getMob() {
		return mob;
	}
	/**
	 * @param mob the mob to set
	 */
	public void setMob(String mob) {
		this.mob = mob;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Pojo [id=" + id + ", fName=" + fName + ", lName=" + lName + ", mob=" + mob + ", mail=" + mail + "]";
	}
	
}