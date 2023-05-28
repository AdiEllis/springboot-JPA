package com.example.springbootJPA.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDao {

    @Autowired
    private EmployeeRepository repository;

    public void add(Employee employee) {
        repository.save(employee);
    }

    public void delete(Integer id) {
        Optional<Employee> employee = repository.findById(id);
        employee.ifPresent(value -> repository.delete(value));
    }

    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(employees::add);
        return employees;
    }

}
