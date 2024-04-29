package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.GUNESHWAR_MOD;
import com.example.ce1.repository.GUNESHWAR_R;
import com.example.ce1.repository.GUNESHWAR_REPO;

@Service
public class GUNESHWAR_S {
    @Autowired
    GUNESHWAR_R addressRepo;
    @Autowired
    GUNESHWAR_REPO employeeRepo;
    public GUNESHWAR_MOD setAddressById(int id,GUNESHWAR_MOD address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
