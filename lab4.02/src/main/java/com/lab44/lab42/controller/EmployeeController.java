package com.lab44.lab42.controller;

import com.lab44.lab42.model.Employee;
import com.lab44.lab42.model.Status;
import com.lab44.lab42.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //Create a route to get all doctors.
    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return employeeService.employeeList();
    }

    //Create a route to get a doctor by employee_id.
    @GetMapping("/employee/{employee_id}")
    public Employee getEmployeeByEmployeeId(@PathVariable(value="employee_id") int employeeId) {
        return employeeService.getEmployeeByEmployeeId(employeeId);
    }

    //Create a route to get doctors by status.
    @GetMapping("/employee/{status}")
    public Employee getEmployeeByStatus(@PathVariable(value="status") Status status) {
        return (Employee) employeeService.getEmployeeByStatus(status);
    }
}
