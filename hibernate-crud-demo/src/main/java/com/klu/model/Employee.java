package com.klu.model;
import javax.persistence.*;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String empname;
	private double empsalary;
	@ManyToOne
	@JoinColumn(name="deptid")
	private Department department;
	
	public void  setEmpId(int empid) {
		this.empid = empid;
	}
	public int getEmpId() {
		return empid;
	}
	public void setEmpName(String EmpName) {
		this.empname = empname;
	}
	public String getEmpName() {
		return empname;
	}
	public void setEmpSalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public double setEmpSalary() {
		return empsalary;
	}

}
