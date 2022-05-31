package com.company.departmentmanagement.dto;

public class UserInfoDTO {

        private String firstName;
        private String lastName;
        private String idCard;
        private String address;
        private String age;
        private String phone;
        private UserRoleDTO userRoleDTO;


    public UserInfoDTO(String firstName, String lastName, String idCard, String address, String age, String phone, UserRoleDTO userRoleDTO) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idCard = idCard;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.userRoleDTO = userRoleDTO;
    }

    public UserInfoDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserRoleDTO getUserRoleDTO() {
        return userRoleDTO;
    }

    public void setUserRoleDTO(UserRoleDTO userRoleDTO) {
        this.userRoleDTO = userRoleDTO;
    }
}
