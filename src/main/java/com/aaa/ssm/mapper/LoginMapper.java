package com.aaa.ssm.mapper;

import com.aaa.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    User selectUidByLoginAccount(@Param("loginAccount") String loginAccount,@Param("LoginPassword") String encodedLoginPassword);
}
