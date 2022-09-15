package com.jingchao.controller;


import com.jingchao.dao.EmployeeDao;
import com.jingchao.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        Collection<Employee> allEmployee = employeeDao.getAll();
        model.addAttribute("allEmployee",allEmployee);
        return "employee_list";
    }

    @PostMapping("/employee")
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/employee/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute(employee);
        return "employee_update";
    }

    @PutMapping("/employee")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }

}
