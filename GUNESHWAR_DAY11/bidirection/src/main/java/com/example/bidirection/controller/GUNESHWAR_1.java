package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.GUNESHWAR_2;
import com.example.bidirection.model.GUNESHWAR_3;
import com.example.bidirection.service.GUNESHWAR_6;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class GUNESHWAR_1 {
    public GUNESHWAR_6 studentService;
    public GUNESHWAR_1(GUNESHWAR_6 studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public GUNESHWAR_2 postMethodName(@RequestBody GUNESHWAR_2 student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public GUNESHWAR_3 postMethodName(@RequestBody GUNESHWAR_3 studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<GUNESHWAR_2> getMethodName() {
        return studentService.getStudents();
    }
    
}