package com.company.departmentmanagement.service.impl;

import com.company.departmentmanagement.dto.UserRoleDTO;
import com.company.departmentmanagement.entity.UserRole;
import com.company.departmentmanagement.repository.IUserRoleRepository;
import com.company.departmentmanagement.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRoleServiceImpl implements IUserRoleService {

    @Autowired
    private IUserRoleRepository userRoleRepository;

    @Override
    public List<UserRoleDTO> getAllRoles() {
        List<UserRole> userRoles =  userRoleRepository.findAll();

        List<UserRoleDTO> userRoleDTOS = new ArrayList<>();

        for (UserRole ur : userRoles) {
            userRoleDTOS.add(convertEntityToDto(ur));
        }

        return userRoleDTOS;
    }

    public UserRoleDTO convertEntityToDto(UserRole userRole){
        UserRoleDTO userRoleDTO = new UserRoleDTO();
        userRoleDTO.setRoleName(userRole.getRoleName());

        return userRoleDTO;
    }
}
