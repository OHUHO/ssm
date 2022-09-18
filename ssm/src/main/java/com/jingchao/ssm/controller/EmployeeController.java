package com.jingchao.ssm.controller;


import com.github.pagehelper.PageInfo;
import com.jingchao.ssm.pojo.Employee;
import com.jingchao.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        //查询所有员工信息
        List<Employee> list = employeeService.getAllEmployee();
        // 将员工信息共享到请求域中
        model.addAttribute("list",list);
        return "employee_list";
    }

    @GetMapping("/employee/page/{pageNum}")
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        // 获取员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        // 将分页数据共享到请求域中
        model.addAttribute("page",page);
        return "employee_list_page";
    }
}
