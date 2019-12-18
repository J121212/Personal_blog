package com.example.demo.service;

/**
 * Created by pc on 2019/7/19.
 */
import com.example.demo.entity.AdminUser;
public interface AdminUserService {

    AdminUser login(String userName, String password);

    AdminUser getUserDetailById(Integer loginUserId);

    Boolean updatePassword(Integer loginUserId,String originalPassword,String newPassword);

    Boolean updateName(Integer loginUserId, String loginUserName, String nickName);

}
