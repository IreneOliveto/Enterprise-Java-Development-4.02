package com.lab44.lab42.repository;

import ch.qos.logback.core.status.Status;
import com.lab44.lab42.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    List<Employee> getEmployeeByStatus(Status status);

    List<Employee> getEmployeeByDepartment(String department);
}
