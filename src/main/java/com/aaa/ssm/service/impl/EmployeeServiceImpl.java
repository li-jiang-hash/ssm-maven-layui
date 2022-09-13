package com.aaa.ssm.service.impl;

import com.aaa.ssm.mapper.EmployeeMapper;
import com.aaa.ssm.pojo.Employee;
import com.aaa.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo getAllEmployeePage(Integer pageNum) {
        PageHelper.startPage(pageNum, 5);
        List<Employee> list = employeeMapper.getAllEmployee();
        PageInfo<Employee> page = new PageInfo<>(list,5);
        return page;
    }
}
