package com.exercise.lab42.service;

import com.exercise.lab42.model.Employee;
import com.exercise.lab42.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public interface PatientService {

    List<Patient> patientList();

    Patient getPatientById(int patientId);

    List<Patient> findAllByDateOfBirthBetween(Date dateOfBirth, Date dateOfBirth2);

    List<Patient> findAllByDepartment(String department);
}
