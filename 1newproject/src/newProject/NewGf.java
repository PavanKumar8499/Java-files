package newProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewGf {
	@Id
private int id;
private String name;
public NewGf() {
	super();
	// TODO Auto-generated constructor stub
}
public NewGf(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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
@Override
public String toString() {
	return "NewGf [id=" + id + ", name=" + name + "]";
}


}
