package com.company.departmentmanagement.repository;

import com.company.departmentmanagement.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
