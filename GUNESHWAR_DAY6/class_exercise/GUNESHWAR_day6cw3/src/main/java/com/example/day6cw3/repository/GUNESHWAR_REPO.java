package com.example.day6cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.model.GUNESHWAR_model;

@Repository
public interface GUNESHWAR_REPO extends JpaRepository<GUNESHWAR_model,Integer>{
    
}
