package com.lab44.lab42.service;

import ch.qos.logback.core.status.Status;
import com.lab44.lab42.model.Employee;
import com.lab44.lab42.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> employeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByEmployeeId(int employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public List<Employee> getEmployeeByStatus(Status status) {
        return employeeRepository.getEmployeeByStatus(status);
    }


    @Override
    public List<Employee> getEmployeeByDepartment(String department) {
        return employeeRepository.getEmployeeByDepartment(department);
    }
}
