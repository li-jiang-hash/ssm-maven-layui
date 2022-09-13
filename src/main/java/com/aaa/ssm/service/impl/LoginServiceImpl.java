package com.aaa.ssm.service.impl;

import com.aaa.ssm.exception.LoginFailedException;
import com.aaa.ssm.mapper.LoginMapper;
import com.aaa.ssm.pojo.User;
import com.aaa.ssm.service.LoginService;
import com.aaa.ssm.util.ImperialCourtConst;
import com.aaa.ssm.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper userDao;
    @Override
    public User getUidByLoginAccount(String loginAccount, String loginPassword) {

        String encodedLoginPassword = MD5Util.encode(loginPassword);
        System.out.println(encodedLoginPassword);
        User user = userDao.selectUidByLoginAccount(loginAccount,encodedLoginPassword);
        if(user !=null){
            System.out.println("登录成功");
            return user;
        }else {
            System.out.println("登陆失败");
            throw new LoginFailedException(ImperialCourtConst.LOGIN_FAILED_MESSAGE);
        }
    }
}
