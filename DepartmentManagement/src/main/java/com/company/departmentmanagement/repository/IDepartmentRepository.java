package com.company.departmentmanagement.repository;


import com.company.departmentmanagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer > {
}
