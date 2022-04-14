package com.hibernate.crud.onetomany;

import java.util.Set;

public class Student1{
	private long student_id;
	private String student_roll_no;
	private Set studentFees;
	
	public Set getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(Set studentFees) {
		this.studentFees = studentFees;
	}
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public String getStudent_roll_no() {
		return student_roll_no;
	}
	public void setStudent_roll_no(String student_roll_no) {
		this.student_roll_no = student_roll_no;
	}
	
}




