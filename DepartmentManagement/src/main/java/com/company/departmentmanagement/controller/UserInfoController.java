package com.company.departmentmanagement.controller;

import com.company.departmentmanagement.dto.UserInfoDTO;
import com.company.departmentmanagement.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @GetMapping("/getAllUsers")
    public List<UserInfoDTO> getAllUsers(){
        return userInfoService.getAllUsers();
    }

}
