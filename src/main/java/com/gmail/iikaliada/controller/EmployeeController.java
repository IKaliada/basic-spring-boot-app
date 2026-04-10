package com.gmail.iikaliada.controller;

import com.gmail.iikaliada.model.Employee;
import com.gmail.iikaliada.model.EmployeeRequest;
import com.gmail.iikaliada.model.EmployeeResponse;
import com.gmail.iikaliada.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("employee")
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest employeeRequest){
        return employeeService.createEmployee(employeeRequest);
    }

    @GetMapping("employee")
    public List<Employee> findAllEmployees(){
        return employeeService.findAllEmployees();
    }

}
