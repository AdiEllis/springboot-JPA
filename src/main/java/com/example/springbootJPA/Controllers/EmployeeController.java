package com.example.springbootJPA.Controllers;

import com.example.springbootJPA.Entities.BasicResponseModel;
import com.example.springbootJPA.Models.Employee;
import com.example.springbootJPA.Models.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @PostMapping("/employee/add")
    public BasicResponseModel addEmployee(Employee employee) {
        return employeeDao.add(employee);
    }

    @PostMapping("/employee/delete")
    public BasicResponseModel deleteEmployee(Integer id) {
        return employeeDao.delete(id);
    }

    @GetMapping("/employee/getAll")
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
