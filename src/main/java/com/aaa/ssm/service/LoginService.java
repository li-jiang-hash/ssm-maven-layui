package com.aaa.ssm.service;

import com.aaa.ssm.pojo.User;

public interface LoginService {
    User getUidByLoginAccount(String loginAccount, String loginPassword);
}
