package com.klu.model;

import org.springframework.beans.factory.annotation.Value;

public class CourseRegistration {
	@Value("100")
	private int rollNo;
	@Value("rakesh")
	private String StudentName;
	@Value("FSAD")
	private String CourseName;
	@Value("4")
	private int Semester;
	
	public CourseRegistration(int no, String name, String cn, int sem) {
		rollNo = no;
		StudentName = name;
		CourseName = cn;
		Semester = sem;
	}
	public void display() {
		System.out.println("RoolNo:"+rollNo);
		System.out.println("Name:"+StudentName);
		System.out.println("Course"+CourseName);
		System.out.println("Semester"+Semester);
	}

}
