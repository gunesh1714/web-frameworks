package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.GUNESHWAR_model;
import com.examly.class_exercise_1.repository.GUNESHWAR_repo;

@Service
public class GUNESHWAR_service {

     @Autowired
     public GUNESHWAR_repo personRepo;

     public GUNESHWAR_model SaveEntity(GUNESHWAR_model entity) {
          return personRepo.save(entity);

     }

     public List<GUNESHWAR_model> getDetails() {
          return personRepo.findAll();

     }

     public List<GUNESHWAR_model> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
