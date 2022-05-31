package com.company.departmentmanagement.controller;

import com.company.departmentmanagement.dto.UserRoleDTO;
import com.company.departmentmanagement.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/role")
public class UserRoleController {

    @Autowired
    private IUserRoleService userRoleService;

    @GetMapping(value = "/getAllRoles")
    public List<UserRoleDTO> getAllRoles(){
        return userRoleService.getAllRoles();
    }

}
