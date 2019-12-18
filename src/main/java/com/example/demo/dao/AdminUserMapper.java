package com.example.demo.dao;

import com.example.demo.entity.AdminUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by pc on 2019/7/19.
 */
@Component
public interface AdminUserMapper {

    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    AdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);


}
