package com.lab44.lab42.controller;

import com.lab44.lab42.model.Patient;
import com.lab44.lab42.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;


    //Create a route to get all patients.
    @GetMapping("/patients")
    public List<Patient> getAllPatient() {
        return patientService.patientList();
    }

    //Create a route to get a patient by patient_id.
    @GetMapping("/patient/{patient_id}")
    public Patient getPatientById(@PathVariable(value="patient_id") int patientId) {
        return patientService.getPatientById(patientId);
    }

    //Create a route to get patients date of birth within a specified range.
    @GetMapping("/patients/{date}")
    public List<Patient> findAllByDateOfBirthBetween(@RequestParam(value = "dateOfBirth") Date dateOfBirth, @RequestParam(value = "dateOfBirth2") Date dateOfBirth2){
        return patientService.findAllByDateOfBirthBetween(dateOfBirth, dateOfBirth2);
    }

    //Create a route to get patients by the department that their admitting doctor is in
    // (For example, get all patients admitted by a doctor in cardiology).
    /*@GetMapping("/patients/{department}")
    public List<Patient> findAllByDepartment(@PathVariable(value="department") String department) {
        return patientService.findAllByDepartment(department);
    }*/

    //Create a route to get all patients with a doctor whose status is OFF.



}
