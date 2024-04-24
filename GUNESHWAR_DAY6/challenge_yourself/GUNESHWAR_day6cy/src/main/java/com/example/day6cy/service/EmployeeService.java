package com.example.day6cy.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cy.model.GUNESHWAR_model;
import com.example.day6cy.repository.GUNESHWAR_repo;

@Service
public class EmployeeService {
    public GUNESHWAR_repo employeeRepo;
    public EmployeeService(GUNESHWAR_repo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean postEmployee(GUNESHWAR_model employee)
    {
        try{

            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<GUNESHWAR_model> sortEmployee(String field)
    {
        return employeeRepo.findAll(Sort.by(field));
    }
    public List<GUNESHWAR_model> paginationEmployee(int pageno,int size)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<GUNESHWAR_model>  sortPaginationEmployee(int pageno,int size,String field)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
