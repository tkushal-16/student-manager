package com.studentapp.controller;

import com.studentapp.model.StudentEntity;
import com.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity student) {
        if (studentService.getStudentByEmail(student.getEmail()) == null) {
            return ResponseEntity.ok(studentService.addStudent(student));
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/view")
    public ResponseEntity<List<StudentEntity>> viewStudent() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
