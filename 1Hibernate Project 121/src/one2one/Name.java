package one2one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Name {
	@Id
	private int id ;
	private int mob;
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Name(int id, int mob) {
		super();
		this.id = id;
		this.mob = mob;
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
	 * @return the mob
	 */
	public int getMob() {
		return mob;
	}
	/**
	 * @param mob the mob to set
	 */
	public void setMob(int mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Name [id=" + id + ", mob=" + mob + "]";
	}
	
}
