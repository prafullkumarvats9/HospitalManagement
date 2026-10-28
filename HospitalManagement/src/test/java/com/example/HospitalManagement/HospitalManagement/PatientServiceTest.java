package com.example.HospitalManagement.HospitalManagement;

import com.example.HospitalManagement.HospitalManagement.dto.BloodGroupStats;
import com.example.HospitalManagement.HospitalManagement.dto.CPatientInfo;
import com.example.HospitalManagement.HospitalManagement.dto.PatientInfo;
import com.example.HospitalManagement.HospitalManagement.entity.Patient;
import com.example.HospitalManagement.HospitalManagement.repository.PatientRepository;
import com.example.HospitalManagement.HospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatient() {
//        List<Patient> patientList = patientRepository.findAll();

//        List<CPatientInfo> patientList = patientRepository.getAllPateintsInfoConcrete();

//        List<BloodGroupStats> patientList = patientRepository.getBloodGroupStats();
//
//        for(var p : patientList) {
//            System.out.println(p);
//        }
//
//        Patient patient = new Patient();
//        patientRepository.save(patient);

//        patientService.testPatientTransaction();

        List<Patient> patientList = patientRepository.getAllPatientsWithAppointment();

        for(var p: patientList) {
            System.out.println(p);
        }
    }
}
