package com.example.HospitalManagement.HospitalManagement.service;


import com.example.HospitalManagement.HospitalManagement.entity.Insurance;
import com.example.HospitalManagement.HospitalManagement.entity.Patient;
import com.example.HospitalManagement.HospitalManagement.repository.InsuranceRepository;
import com.example.HospitalManagement.HospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;

    private final PatientRepository patientRepository;

    @Transactional
    public void assignInsuranceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(insurance);
    }
}
