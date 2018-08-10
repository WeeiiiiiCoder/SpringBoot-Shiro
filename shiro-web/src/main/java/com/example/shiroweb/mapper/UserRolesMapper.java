package com.example.shiroweb.mapper;

import com.example.shiroweb.entity.UserRoles;

import java.util.List;

public interface UserRolesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roles
     *
     * @mbg.generated
     */
    int insert(UserRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_roles
     *
     * @mbg.generated
     */
    int insertSelective(UserRoles record);

    List<String> getRolesByUsername(String username);
}