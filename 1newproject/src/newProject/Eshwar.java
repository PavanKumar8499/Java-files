package newProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Eshwar {
	@Id
private int id ;
private String name;
@OneToOne
private NewGf gf ;
public Eshwar() {
	super();
	// TODO Auto-generated constructor stub
}
public Eshwar(int id, String name, NewGf gf) {
	super();
	this.id = id;
	this.name = name;
	this.gf = gf;
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
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the gf
 */
public NewGf getGf() {
	return gf;
}
/**
 * @param gf the gf to set
 */
public void setGf(NewGf gf) {
	this.gf = gf;
}
@Override
public String toString() {
	return "Eshwar [id=" + id + ", name=" + name + ", gf=" + gf + "]";
}



}
