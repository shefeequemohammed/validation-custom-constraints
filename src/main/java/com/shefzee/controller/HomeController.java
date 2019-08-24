package com.shefzee.controller;

import com.shefzee.dto.EmployeeCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HomeController {

    public ResponseEntity createEmployee(@Valid @RequestBody EmployeeCreateRequest employeeCreateRequest){
        return null;

    }
}
