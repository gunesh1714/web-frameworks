package com.example.day6cy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GUNESHWAR_model {
    @Id
    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeeMobile;
    public GUNESHWAR_model() {
    }
    public GUNESHWAR_model(int employeeId, String employeeName, String employeeEmail, String employeeMobile) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeMobile = employeeMobile;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public String getEmployeeMobile() {
        return employeeMobile;
    }
    public void setEmployeeMobile(String employeeMobile) {
        this.employeeMobile = employeeMobile;
    }
    
}
