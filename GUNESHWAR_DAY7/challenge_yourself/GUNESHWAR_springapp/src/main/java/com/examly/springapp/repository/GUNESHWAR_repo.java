package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.GUNESHWAR_model;

@Repository
public interface GUNESHWAR_repo extends JpaRepository<GUNESHWAR_model, Integer> {

    public List<GUNESHWAR_model> findByProductCategory(String productCategory);
    public List<GUNESHWAR_model> findByPriceCategory(String priceCategory);

}
