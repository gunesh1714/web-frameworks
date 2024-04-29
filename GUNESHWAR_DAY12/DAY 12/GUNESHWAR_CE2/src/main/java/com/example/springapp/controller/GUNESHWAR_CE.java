package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.GUNESHWAR_STUD;
import com.example.springapp.service.GUNESHWAR_O;

@RestController
public class GUNESHWAR_CE {
    @Autowired
    GUNESHWAR_O studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<GUNESHWAR_C> addStudentDetails(@PathVariable int id,@RequestBody GUNESHWAR_C studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
