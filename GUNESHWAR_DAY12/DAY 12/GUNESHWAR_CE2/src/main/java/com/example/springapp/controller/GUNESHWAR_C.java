package com.example.springapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.GUNESHWAR_STUD;
import com.example.springapp.service.GUNESHWAR_SERCLAS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class GUNESHWAR_C{
    @Autowired
    GUNESHWAR_SERCLAS studentService;
    @PostMapping("/student")
    public ResponseEntity<GUNESHWAR_STUD> addStudents(@RequestBody GUNESHWAR_STUD student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<GUNESHWAR_STUD>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<GUNESHWAR_STUD>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


