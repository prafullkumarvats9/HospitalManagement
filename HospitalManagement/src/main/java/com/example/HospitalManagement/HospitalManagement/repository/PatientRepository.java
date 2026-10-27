package com.example.HospitalManagement.HospitalManagement.repository;

import com.example.HospitalManagement.HospitalManagement.dto.BloodGroupStats;
import com.example.HospitalManagement.HospitalManagement.dto.CPatientInfo;
import com.example.HospitalManagement.HospitalManagement.dto.PatientInfo;
import com.example.HospitalManagement.HospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface  PatientRepository extends JpaRepository<Patient, Long> {

//    List<Patient> findByEmailContaining(String d);

    @Query("select p.id, p.name, p.email from Patient p")
    List<PatientInfo> getAllPateintsInfo();


    @Query("select new com.example.HospitalManagement.HospitalManagement.dto.CPatientInfo(p.id, p.name) " + " from Patient p")
    List<CPatientInfo> getAllPateintsInfoConcrete();

    @Query("select new com.example.HospitalManagement.HospitalManagement.dto.BloodGroupStats(p.bloodGroup,"
            + "COUNT(p)) from Patient p group by p.bloodGroup order by COUNT(p)")
    List<BloodGroupStats> getBloodGroupStats();
}
