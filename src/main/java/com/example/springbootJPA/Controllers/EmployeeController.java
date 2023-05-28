package com.example.springbootJPA.Controllers;

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
    public void addEmployee(Employee employee) {
        employeeDao.add(employee);
        System.out.println("Employee added");
    }

    @PostMapping("/employee/delete")
    public void deleteEmployee(Integer id) {
        employeeDao.delete(id);
        System.out.println("Employee deleted");
    }

    @GetMapping("/employee/getAll")
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
