package com.tejumvsr.learning.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

//@Entity(name = "student_table")
@Entity
@Table(name = "student")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	@Column(name="id")
	private int sRollNo;
	
//	@Transient
	@Column(name = "name")
	private StudentName sName;
	@Column(name = "age")
	private int sAge;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Laptop> laptops = new ArrayList<>();

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public int getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}

	public StudentName getsName() {
		
		return sName;
	}

	public void setsName(StudentName sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	@Override
	public String toString() {
		return "Student [sRollNo=" + sRollNo + ", sName=" + sName + ", sAge=" + sAge + ", laptops=" + laptops + "]";
	}
		
}