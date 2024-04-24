package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.GUNESHWAR_model;

/**
 * PersonRepo
 */
@Repository
public interface GUNESHWAR_repo extends JpaRepository<GUNESHWAR_model, Integer> {

     List<GUNESHWAR_model> findByAge(int byAge);
}