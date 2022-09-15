package com.lab44.lab42.service;

import ch.qos.logback.core.status.Status;
import com.lab44.lab42.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> employeeList();
    Employee getEmployeeByEmployeeId(int employeeId);

    List<Employee> getEmployeeByStatus(Status status);

    List<Employee> getEmployeeByDepartment(String department);
}
