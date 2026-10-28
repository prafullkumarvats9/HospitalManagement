package com.example.HospitalManagement.HospitalManagement.service;

import com.example.HospitalManagement.HospitalManagement.entity.Appointment;
import com.example.HospitalManagement.HospitalManagement.entity.Doctor;
import com.example.HospitalManagement.HospitalManagement.entity.Patient;
import com.example.HospitalManagement.HospitalManagement.repository.AppointmentRepository;
import com.example.HospitalManagement.HospitalManagement.repository.DoctorRepository;
import com.example.HospitalManagement.HospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId) {
          Patient patient = patientRepository.findById(patientId).orElseThrow();
          Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

          appointment.setPatient(patient);
          appointment.setDoctor(doctor);

          appointmentRepository.save(appointment);

          return appointment;
    }


}
