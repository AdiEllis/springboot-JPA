package com.example.springbootJPA.Models;

import com.example.springbootJPA.Entities.BasicResponseModel;
import com.example.springbootJPA.Repositories.CompanyRepository;
import com.example.springbootJPA.Utils.Definition;
import com.example.springbootJPA.Utils.ObjectValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyDao {

    @Autowired
    private CompanyRepository repository;

    @Autowired
    private ObjectValidator objectValidator;

    public BasicResponseModel add(Company company) {
        BasicResponseModel response;
        if (objectValidator.isCompanyObjectValid(company)) {
            repository.save(company);
            response = new BasicResponseModel(company);
        } else {
            response = new BasicResponseModel(Definition.MISSING_FIELDS_ERROR_CODE, Definition.MISSING_FIELDS_MESSAGE);
        }
        return response;
    }
}
