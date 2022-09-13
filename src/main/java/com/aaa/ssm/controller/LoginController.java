package com.aaa.ssm.controller;

import com.aaa.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/auth")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String LoginUser(@Value("loginAccount") String username,@Value("loginPassword") String pass){
        System.err.print(username+"-----"+pass);
//        loginService.getUidByLoginAccount(login);
        return "employee_list";
    }

//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public String getGoods() {
//        return "employee_list";
//    }
}
