package com.example.springbootJPA.Models;

import com.example.springbootJPA.Entities.BasicResponseModel;
import com.example.springbootJPA.Repositories.EmployeeRepository;
import com.example.springbootJPA.Utils.Definition;
import com.example.springbootJPA.Utils.ObjectValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDao {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private ObjectValidator objectValidator;

    public BasicResponseModel add(Employee employee) {
        BasicResponseModel response;
        if (!objectValidator.isEmployeeObjectValid(employee)) {
            response = new BasicResponseModel(Definition.MISSING_FIELDS_ERROR_CODE, Definition.MISSING_FIELDS_MESSAGE);
        }
        else if (!objectValidator.isEmployeeNumberValid(employee.getEmployeeNumber())) {
            response = new BasicResponseModel(Definition.INVALID_EMPLOYEE_NUMBER_ERROR_CODE, Definition.INVALID_EMPLOYEE_NUMBER_MESSAGE);
        } else {
            repository.save(employee);
            response = new BasicResponseModel(employee);
        }
        return response;
    }

    public BasicResponseModel delete(Integer id) {
        BasicResponseModel response;
        Optional<Employee> employee = repository.findById(id);
        if (employee.isPresent()) {
            repository.delete(employee.get());
            response = new BasicResponseModel("Employee " + id + " was deleted");
        } else {
            response = new BasicResponseModel(Definition.EMPLOYEE_NOT_FOUND_ERROR_CODE, Definition.EMPLOYEE_NOT_FOUND_MESSAGE);
        }
        return response;
    }

    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(employees::add);
        return employees;
    }

}
