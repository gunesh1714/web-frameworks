package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.GUNESHWAR_C;
import com.example.day14ce1.repository.GUNESHWAR_REPO;

@Service

public class GUNESHWAR_E {
    @Autowired
    GUNESHWAR_REPO employeeRepo;

    public GUNESHWAR_C addEmployee(GUNESHWAR_C employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GUNESHWAR_C> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<GUNESHWAR_C> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
