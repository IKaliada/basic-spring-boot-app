package com.gmail.iikaliada.service;

import com.gmail.iikaliada.model.Employee;
import com.gmail.iikaliada.model.EmployeeRequest;
import com.gmail.iikaliada.model.EmployeeResponse;
import com.gmail.iikaliada.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setFirstName(employeeRequest.getFirstName());
        employee.setLastName(employeeRequest.getLastName());
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(savedEmployee.getId());
        log.warn("Employee was created with id = " + savedEmployee.getId());
        return employeeResponse;
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
