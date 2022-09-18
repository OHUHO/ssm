package com.jingchao.ssm.controller;


import com.jingchao.ssm.pojo.Employee;
import com.jingchao.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        List<Employee> list = employeeService.getAllEmployee();
        model.addAttribute("list",list);
        return "employee_list";
    }
}
