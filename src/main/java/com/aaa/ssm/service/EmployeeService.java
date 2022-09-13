package com.aaa.ssm.service;

import com.aaa.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    PageInfo getAllEmployeePage(Integer pageNum);
}
