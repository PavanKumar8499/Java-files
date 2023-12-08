package hibernatePractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewTable {
	@Id
private int id;
private String fName, lName;
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
@Override
public String toString() {
	return "NewTable [id=" + id + ", fName=" + fName + ", lName=" + lName + "]";
}
public NewTable(int id, String fName, String lName) {
	super();
	this.id = id;
	this.fName = fName;
	this.lName = lName;
}

}
