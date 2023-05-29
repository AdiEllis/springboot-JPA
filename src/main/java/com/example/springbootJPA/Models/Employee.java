package com.example.springbootJPA.Models;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private String employeeNumber;
    private String branch;

    @ManyToOne
    @JoinColumn(name = "companyID")
    private Company company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
