package com.master.yotubeProjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private int eid;
	@Column(name="emp_name")
	private String eName;
	@Column(name="company_name")
	private String eCompanyName;
	@Column(name="salary")
	private double eSalary;

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteCompanyName() {
		return eCompanyName;
	}
	public void seteCompanyName(String eCompanyName) {
		this.eCompanyName = eCompanyName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eCompanyName=" + eCompanyName + ", eSalary=" + eSalary
				+ "]";
	}
	

}
