package com.example.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.GUNESHWAR_model;
import com.example.class_exercise_2.repository.GUNESHWAR_repo;

@Service
public class StudentService {

     @Autowired
     public GUNESHWAR_repo studentRepo;

     public List<GUNESHWAR_model> getAll() {
          return studentRepo.findAll();
     }

     public GUNESHWAR_model post(GUNESHWAR_model student) {
          return studentRepo.save(student);
     }

     public List<GUNESHWAR_model> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
