package com.example.class_exercise_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.model.GUNESHWAR_model;

@Repository
public interface GUNESHWAR_repo extends JpaRepository<GUNESHWAR_model, Integer> {

}