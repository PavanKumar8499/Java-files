package demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KidsInfo {
	@Id
	private int id;
	private int age;
	private String fName;
	public KidsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KidsInfo(int id, int age, String fName) {
		super();
		this.id = id;
		this.age = age;
		this.fName = fName;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "KidsInfo [id=" + id + ", age=" + age + ", fName=" + fName + "]";
	}
	
	
}
