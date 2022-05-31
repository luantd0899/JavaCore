package com.company.departmentmanagement.dto;

import java.util.List;

public class UserRoleDTO {
    private String roleName;
    private List<UserInfoDTO> userInfoDTOS;

    public UserRoleDTO(String roleName, List<UserInfoDTO> userInfoDTOS) {
        this.roleName = roleName;
        this.userInfoDTOS = userInfoDTOS;
    }



    public UserRoleDTO() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

//    public List<UserLoginInfoDTO> getUserInfoDTOS() {
//        return userLoginInfoDTOS;
//    }
//
//    public void setUserInfoDTOS(List<UserLoginInfoDTO> userLoginInfoDTOS) {
//        this.userLoginInfoDTOS = userLoginInfoDTOS;
//    }
}
