package com.example.springbootJPA.Utils;

import org.springframework.stereotype.Component;

@Component
public class Definition {

    public static final int MISSING_FIELDS_ERROR_CODE = 404;
    public static final String MISSING_FIELDS_MESSAGE = "Missing mandatory fields";

    public static final int INVALID_EMPLOYEE_NUMBER_ERROR_CODE = 300;
    public static final String INVALID_EMPLOYEE_NUMBER_MESSAGE = "Invalid employee number";

    public static final int EMPLOYEE_NOT_FOUND_ERROR_CODE = 400;

    public static final String EMPLOYEE_NOT_FOUND_MESSAGE = "Employee not found";
}
