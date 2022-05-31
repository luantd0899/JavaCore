package com.company.departmentmanagement.service;


import com.company.departmentmanagement.dto.UserInfoDTO;


import java.util.List;

public interface IUserInfoService {
    List<UserInfoDTO> getAllUsers();
}
