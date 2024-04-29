package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.GUNESHWAR_MO;
import com.example.ce1.repository.GUNESHWAR_REPO;

@Service
public class GUNESHWAR_A {
    @Autowired
    GUNESHWAR_REPO employeeRepo;

    @SuppressWarnings("null")
    public GUNESHWAR_MO setEmployee(GUNESHWAR_MO employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GUNESHWAR_MO> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<GUNESHWAR_MO> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
