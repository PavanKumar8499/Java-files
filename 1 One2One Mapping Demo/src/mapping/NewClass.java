package mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class NewClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int eid;
	private String ename;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="add")
	private Address add;
	/**
	 * 
	 */
	public NewClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param eid
	 * @param ename
	 * @param add
	 */
	public NewClass(int eid, String ename, Address add) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.add = add;
	}
	
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the add
	 */
	public Address getAdd() {
		return add;
	}
	/**
	 * @param add the add to set
	 */
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", add=" + add + "]";
	}

}
