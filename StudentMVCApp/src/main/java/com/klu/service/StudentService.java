package com.klu.service;

import java.util.List;
import com.klu.model.Student;

public interface StudentService {

    String getWelcomemessage();

    Student createStudent(Student student);

    Student getStudentById(int id);   

    List<Student> getAllStudent();

    Student updateStudent(int id, Student student);

    String deleteStudent(int id);

    List<Student> searchStudent(String name, String course);
}
