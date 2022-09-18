package com.jingchao.ssm.mapper;

import com.jingchao.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
