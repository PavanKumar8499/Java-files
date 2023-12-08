package queryNdCriteria;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Q {
	@Id
	private int id,standard,pincode;
	private String fName, lName;
	public Q() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Q(int id, int standard, int pincode, String fName, String lName) {
		super();
		this.id = id;
		this.standard = standard;
		this.pincode = pincode;
		this.fName = fName;
		this.lName = lName;
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
	 * @return the standard
	 */
	public int getStandard() {
		return standard;
	}
	/**
	 * @param standard the standard to set
	 */
	public void setStandard(int standard) {
		this.standard = standard;
	}
	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
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
	@Override
	public String toString() {
		return "QueryNdCriteria [id=" + id + ", standard=" + standard + ", pincode=" + pincode + ", fName=" + fName
				+ ", lName=" + lName + "]";
	}
	
}
