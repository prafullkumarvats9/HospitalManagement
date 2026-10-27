package com.example.HospitalManagement.HospitalManagement.repository;

import com.example.HospitalManagement.HospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}