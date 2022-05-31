package com.company.departmentmanagement.controller;

import com.company.departmentmanagement.entity.Department;
import com.company.departmentmanagement.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/department")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @GetMapping(value = "/getAllDepartments")
    public ResponseEntity<?> getAllDepartments(){
        return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatus.OK);
    }
}
