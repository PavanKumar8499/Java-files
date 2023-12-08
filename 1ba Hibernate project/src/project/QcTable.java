package project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QcTable {
	@Id
	private int id;
	@Override
	public String toString() {
		return "QcTable [id=" + id + ", clas=" + clas + ", fName=" + fName + ", lName=" + lName + ", city=" + city
				+ "]";
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
	 * @return the clas
	 */
	public int getClas() {
		return clas;
	}
	/**
	 * @param clas the clas to set
	 */
	public void setClas(int clas) {
		this.clas = clas;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	public QcTable(int id, int clas, String fName, String lName, String city) {
		super();
		this.id = id;
		this.clas = clas;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
	}
	private int clas;
	private String fName, lName, city;
	public QcTable() {
		super();
		// TODO Auto-generated constructor stub
	}
}
