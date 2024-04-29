package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.GUNESHWAR_MO;
import com.example.ce1.service.GUNESHWAR_A;

@RestController
public class GUNESHWAR_AD2 {
    @Autowired
    GUNESHWAR_A employeeService;

    @PostMapping("/employee")
    public GUNESHWAR_MO setMethod(@RequestBody GUNESHWAR_MO employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<GUNESHWAR_MO> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<GUNESHWAR_MO> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
