package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.GUNESHWAR_model;
import com.example.class_exercise_1.repository.GUNESHWAR_REPO;

@Service
public class ChildrenService {

     @Autowired
     public GUNESHWAR_REPO childrenRepo;

     public List<GUNESHWAR_model> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public GUNESHWAR_model save(GUNESHWAR_model children) {
          return childrenRepo.save(children);

     }

     public List<GUNESHWAR_model> sortedPage(int offset, int pagesize, String field) {
          Page<GUNESHWAR_model> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<GUNESHWAR_model> pagination(int offset, int pagesize) {
          Page<GUNESHWAR_model> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
