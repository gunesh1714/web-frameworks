package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.GUNESHWAR_2;
import com.example.bidirection.model.GUNESHWAR_3;
import com.example.bidirection.repository.GUNESHWAR_4;
import com.example.bidirection.repository.GUNESHWAR_5;

@Service
public class GUNESHWAR_6 {
    public GUNESHWAR_5 studentRepository;
    public GUNESHWAR_4 studentInfoRepository;
    public GUNESHWAR_6(GUNESHWAR_5 studentRepository,GUNESHWAR_4 studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public GUNESHWAR_2 saveStudent(GUNESHWAR_2 student)
    {
        return studentRepository.save(student);
    }
    public GUNESHWAR_3 saveStudentInfo(GUNESHWAR_3 studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<GUNESHWAR_2> getStudents()
    {
        return studentRepository.findAll();
    }
}
