package Dto ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	int student_id ;
	
	@Column(nullable = false)
	String student_name ;
	
	@Column(nullable = false, unique = true)
	String student_contact;
	
	@Column(nullable = false)
	int student_class;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_contact() {
		return student_contact;
	}

	public void setStudent_contact(String student_contact) {
		this.student_contact = student_contact;
	}

	public int getStudent_class() {
		return student_class;
	}

	public void setStudent_class(int student_class) {
		this.student_class = student_class;
	}
	
	
}