package com.studentapp.service;

import com.studentapp.model.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity getStudentByName(String name);

    StudentEntity getStudentByEmail(String email);

    StudentEntity addStudent(StudentEntity student);

    List<StudentEntity> getAllStudents();

}
