package com.exercise.lab42.service;

import com.exercise.lab42.model.Patient;
import com.exercise.lab42.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PatientServiceImp implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public List<Patient> patientList() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(int patientId) {
        return patientRepository.findById(patientId).get();
    }

    @Override
    public List<Patient> findAllByDateOfBirthBetween(Date dateOfBirth, Date dateOfBirth2) {
        return patientRepository.findByDateOfBirthBetween();
    }

    @Override
    public List<Patient> findAllByDepartment(String department) {
        return patientRepository.findAllByDepartment();
    }

}
