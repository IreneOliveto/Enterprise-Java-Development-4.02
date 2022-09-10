package com.exercise.lab42.repository;

import com.exercise.lab42.model.Employee;
import com.exercise.lab42.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> getEmployeeByStatus(Status status);

    public List<Employee> getEmployeeByDepartment(String department);


}
