package com.lab44.lab42.repository;

import com.lab44.lab42.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    List<Patient> findByDateOfBirthBetween(Date initialDate, Date finalDate);

    @Query(value = "SELECT * FROM patient p left join employee e on e.employee_id = p.admitted_by WHERE e.department = :department",
            nativeQuery = true)
    public List<Patient> findAllPatientsByEmployeeDepartment(@Param("department") String department);

    @Query(value = "SELECT * FROM patient p left join employee e on e.employee_id = p.admitted_by WHERE e.status = :status",
            nativeQuery = true)
    public List<Patient> findAllPatientsByEmployeeStatus(@Param("status") String status);
}
