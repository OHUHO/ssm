package com.jingchao.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jingchao.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
