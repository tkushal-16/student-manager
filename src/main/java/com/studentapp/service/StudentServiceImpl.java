package com.studentapp.service;

import com.studentapp.model.StudentEntity;
import com.studentapp.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentEntity getStudentByName(String name) {
        return null;
    }

    @Override
    public StudentEntity getStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
