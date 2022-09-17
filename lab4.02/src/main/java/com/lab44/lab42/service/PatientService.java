package com.lab44.lab42.service;

import com.lab44.lab42.model.Patient;

import java.util.Date;
import java.util.List;

public interface PatientService {


    List<Patient> patientList();

    Patient getPatientById(int patientId);

    List<Patient> findAllByDateOfBirthBetween(Date dateOfBirth, Date dateOfBirth2);

    List<Patient> findAllPatientsByEmployeeDepartment(String department);

    List<Patient> findAllPatientsByEmployeeStatus(String status);
}
