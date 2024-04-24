package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.GUNESHWAR_model;
import com.examly.class_exercise_1.service.GUNESHWAR_service;

@RestController
public class GUNESHWAR_controller {

     @Autowired
     public GUNESHWAR_service personService;

     @PostMapping("/api/person")
     public ResponseEntity<GUNESHWAR_model> postMethodName(@RequestBody GUNESHWAR_model entity) {

          GUNESHWAR_model inst = personService.SaveEntity(entity);

          return new ResponseEntity<GUNESHWAR_model>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<GUNESHWAR_model>> getMethodName() {

          List<GUNESHWAR_model> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<GUNESHWAR_model>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<GUNESHWAR_model>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<GUNESHWAR_model> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}