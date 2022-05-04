package com.prokhnov.springboot.thymeleafdemo.controller;

import com.prokhnov.springboot.thymeleafdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employees;

    @PostConstruct
    private void loadData(){

        Employee employee1 = new Employee(1,"Leslie","Andrews","la@gmail.com");
        Employee employee2 = new Employee(2,"Emma","Brown","eb@gmail.com");
        Employee employee3 = new Employee(3,"Avani","Gupta","la@gmail.com");

        employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        model.addAttribute("employees", employees);
        return "list-employees";
    }
}
