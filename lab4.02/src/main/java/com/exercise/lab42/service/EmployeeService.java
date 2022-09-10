package com.exercise.lab42.service;


import com.exercise.lab42.model.Employee;
import com.exercise.lab42.model.Status;

import java.util.List;

public interface EmployeeService {
    List<Employee> employeeList();
    Employee getEmployeeByEmployeeId(int employeeId);

    List<Employee> getEmployeeByStatus(Status status);

    List<Employee> getEmployeeByDepartment(String department);
}
