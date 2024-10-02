package com.tejumvsr.learning.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentName {
	private String fName;
	private String lNmae;
	private String mName;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlNmae() {
		return lNmae;
	}
	public void setlNmae(String lNmae) {
		this.lNmae = lNmae;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "StudentName [fName=" + fName + ", lNmae=" + lNmae + ", mName=" + mName + "]";
	}
	

}
