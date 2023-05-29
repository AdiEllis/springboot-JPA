package com.example.springbootJPA.Utils;

import com.example.springbootJPA.Models.Company;
import com.example.springbootJPA.Models.Employee;
import org.springframework.stereotype.Component;

@Component
public class ObjectValidator {

    public boolean isEmployeeObjectValid(Employee employee) {
        if (employee.getName() != null
        && employee.getEmployeeNumber() != null
        && employee.getBranch() != null)
        {
            return !(employee.getName().isEmpty()
                    && employee.getEmployeeNumber().isEmpty()
                    && employee.getBranch().isEmpty());
        }
        return true;
    }

    public boolean isEmployeeNumberValid(String employeeNumber) {
        return employeeNumber.length() < 5;
    }

    public boolean isCompanyObjectValid(Company company) {
        return company.getName() != null && !company.getName().isEmpty();
    }
}
