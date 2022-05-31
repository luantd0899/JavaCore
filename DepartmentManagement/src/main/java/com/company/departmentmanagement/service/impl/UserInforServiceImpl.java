package com.company.departmentmanagement.service.impl;

import com.company.departmentmanagement.dto.UserInfoDTO;
import com.company.departmentmanagement.entity.UserInfo;
import com.company.departmentmanagement.repository.IUserInfoRepository;
import com.company.departmentmanagement.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInforServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoRepository UserInfoRepository;

    @Override
    public List<UserInfoDTO> getAllUsers() {
        List<UserInfo> UserInfos = UserInfoRepository.findAll();

        List<UserInfoDTO> UserInfoDTOS = new ArrayList<>();

        for (UserInfo uli: UserInfos) {
            UserInfoDTOS.add(convertEntitytoDto(uli));
        }

        return UserInfoDTOS;
    }

    public UserInfoDTO convertEntitytoDto(UserInfo UserInfo){
        UserInfoDTO UserInfoDTO = new UserInfoDTO();
        UserInfoDTO.setIdCard(UserInfo.getIdCard());
        UserInfoDTO.setFirstName(UserInfo.getFirstName());
        UserInfoDTO.setLastName(UserInfo.getLastName());
        UserInfoDTO.setAddress(UserInfo.getAddress());
        UserInfoDTO.setAge(UserInfo.getAge());
        UserInfoDTO.setPhone(UserInfo.getPhone());
        UserInfoDTO.setUserRoleDTO(new UserRoleServiceImpl().convertEntityToDto(UserInfo.getUserRole()));

        return UserInfoDTO;
    }

}
