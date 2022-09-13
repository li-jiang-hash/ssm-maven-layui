package com.aaa.ssm.controller;

import com.aaa.ssm.pojo.Employee;
import com.aaa.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "emp/{pageNum}", method = RequestMethod.GET)
    public String getAllEmployeePage(@PathVariable("pageNum") Integer pageNum,Model model) {
//        int i = Integer.parseInt(pageNum);
        PageInfo page = employeeService.getAllEmployeePage(pageNum);
        System.err.println(page);
        model.addAttribute("page",page);
        return "emp";
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        List<Employee> list = employeeService.getAllEmployee();
        model.addAttribute("page", list);
        return "emp";
    }
}
