package genZ;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FamilyTable {
	public FamilyTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
private int id ;
private String fName, lName, education, city;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public FamilyTable(int id, String fName, String lName, String education, String city) {
	super();
	this.id = id;
	this.fName = fName;
	this.lName = lName;
	this.education = education;
	this.city = city;
}
@Override
public String toString() {
	return "Show [id=" + id + ", fName=" + fName + ", lName=" + lName + ", education=" + education + ", city=" + city
			+ "]";
}

}
