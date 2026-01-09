package com.klu.model;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "dept")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int deptid;
	private String deptname;
	@OneToMany(mappedBy = " department",cascadeType )
	public void setDeptId(int deptid) {
		this.deptid= deptid;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptName(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptName() {
		return deptname;
	}

}
