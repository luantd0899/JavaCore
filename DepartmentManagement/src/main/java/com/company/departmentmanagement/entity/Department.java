package com.company.departmentmanagement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;

    @Column(name = "department_name", unique = true, length = 100, nullable = false)
    private String departmentName;

//    @OneToMany(mappedBy = "department")
//    private List<UserInfo> userInfos;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

//    public List<UserInfo> getUserInfos() {
//        return userInfos;
//    }
//
//    public void setUserInfos(List<UserInfo> userInfos) {
//        this.userInfos = userInfos;
//    }
}
