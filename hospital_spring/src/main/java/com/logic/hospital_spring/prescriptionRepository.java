package com.logic.hospital_spring;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface prescriptionRepository extends JpaRepository<prescription,String> {

    List<prescription> findByPatientName(String patientName);
}
