package com.example.day14ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.model.GUNESHWAR_C;

@Repository
public interface GUNESHWAR_REPO extends JpaRepository<GUNESHWAR_C,Long> {
    
}
