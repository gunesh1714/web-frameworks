package com.example.pah1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pah1.model.AppConfig;
@RestController
public class ApiController {
    private final AppConfig ac;
    @Autowired
    public ApiController(AppConfig ac){
        this.ac=ac;
    }
    @GetMapping("/info")
    public String info(){
        return "Student Name:"+ac.getStudentName()+",Department:"+ac.getStudentDepartment();
    }
}