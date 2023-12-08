package hpdemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LetsTry {
@Id
private int id ;
public LetsTry(int id, String firsName, String lastName) {
	super();
	this.id = id;
	this.firsName = firsName;
	this.lastName = lastName;
}
public LetsTry() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "LetsTry [id=" + id + ", firsName=" + firsName + ", lastName=" + lastName + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirsName() {
	return firsName;
}
public void setFirsName(String firsName) {
	this.firsName = firsName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
private String firsName,lastName;

}
