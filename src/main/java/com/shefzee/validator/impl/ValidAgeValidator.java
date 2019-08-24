package com.shefzee.validator.impl;


import com.shefzee.dto.EmployeeRequest;
import com.shefzee.validator.ValidAge;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ValidAgeValidator implements ConstraintValidator<ValidAge, EmployeeRequest> {

    @Override
    public boolean isValid(EmployeeRequest employeeRequest, ConstraintValidatorContext constraintValidatorContext) {

             return employeeRequest.getAge() < 60;

    }

    @Override
    public void initialize(ValidAge constraintAnnotation) {

    }
}
