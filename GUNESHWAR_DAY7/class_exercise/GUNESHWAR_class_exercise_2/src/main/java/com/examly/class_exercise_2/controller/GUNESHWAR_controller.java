package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.GUNESHWAR_model;
import com.examly.class_exercise_2.service.GUNESHWAR_ser;

@RestController
public class GUNESHWAR_controller {

     @Autowired
     public GUNESHWAR_ser CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<GUNESHWAR_model> postMethodName(@RequestBody GUNESHWAR_model entity) {

          GUNESHWAR_model inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<GUNESHWAR_model>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<GUNESHWAR_model>> getMethodName() {

          List<GUNESHWAR_model> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<GUNESHWAR_model>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<GUNESHWAR_model>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<GUNESHWAR_model> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}