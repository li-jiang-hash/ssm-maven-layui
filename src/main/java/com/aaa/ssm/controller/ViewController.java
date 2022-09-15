package com.aaa.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:江Sir
 * @Date:13 2022/09/13 16:37
 * @description: Exercise
 * @Version 1.0.0
 */
@Controller
public class ViewController {
//@RequestMapping("/feedback")
    public String getFeedback(){
    return "feedback";
}

}
