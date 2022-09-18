package com.jingchao.ssm.service;

import com.jingchao.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
