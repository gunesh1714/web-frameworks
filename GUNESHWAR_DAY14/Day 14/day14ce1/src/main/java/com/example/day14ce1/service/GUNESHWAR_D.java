package com.example.day14ce1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.GUNESHWAR_W;
import com.example.day14ce1.repository.GUNESHWAR_RE;

@Service
public class GUNESHWAR_D {
    @Autowired
    GUNESHWAR_RE payrollRepo;

    public GUNESHWAR_W addPayroll(Long id,GUNESHWAR_W payroll)
    {
        GUNESHWAR_W avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<GUNESHWAR_W> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
