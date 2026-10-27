package com.example.HospitalManagement.HospitalManagement.repository;

import com.example.HospitalManagement.HospitalManagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}