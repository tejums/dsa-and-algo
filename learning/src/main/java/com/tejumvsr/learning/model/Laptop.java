package com.tejumvsr.learning.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop {
	@Id
	private int lId;
	private String lName;
	@ManyToMany(mappedBy = "laptops")
	private List<Student> students = new ArrayList<>();
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + "]";
	}

}
