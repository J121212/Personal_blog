package com.example.demo.service.impl;

import com.example.demo.dao.AdminUserMapper;
import com.example.demo.entity.AdminUser;
import com.example.demo.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pc on 2019/7/19.
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    private AdminUserMapper adminUserMapper;
    @Override
    public AdminUser login(String userName, String password) {
         return adminUserMapper.login(userName, password);
    }

    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        return adminUserMapper.selectByPrimaryKey(loginUserId);
    }

    @Override
    public Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword) {
        AdminUser adminUser=adminUserMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null) {
            if(originalPassword.equals(adminUser.getLoginPassword())){
                adminUser.setLoginPassword(newPassword);
                if(adminUserMapper.updateByPrimaryKeySelective(adminUser)>0){
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public Boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null) {
            //设置新密码并修改
            adminUser.setLoginUserName(loginUserName);
            adminUser.setNickName(nickName);
            if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                //修改成功则返回true
                return true;
            }
        }
        return false;
    }
}
