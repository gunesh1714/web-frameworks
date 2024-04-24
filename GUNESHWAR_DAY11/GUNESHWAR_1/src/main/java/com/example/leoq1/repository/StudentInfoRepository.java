package com.example.leoq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.leoq1.model.StudentInfo;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo,Integer>{
    
}