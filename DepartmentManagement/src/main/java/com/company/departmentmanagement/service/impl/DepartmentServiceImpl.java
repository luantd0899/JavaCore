package com.company.departmentmanagement.service.impl;

import com.company.departmentmanagement.entity.Department;
import com.company.departmentmanagement.repository.IDepartmentRepository;
import com.company.departmentmanagement.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
