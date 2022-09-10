package com.exercise.lab42.repository;

import com.exercise.lab42.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository <Patient, Integer> {

    public List<Patient> findByDateOfBirthBetween();

    public List<Patient> findAllByDepartment();


}
