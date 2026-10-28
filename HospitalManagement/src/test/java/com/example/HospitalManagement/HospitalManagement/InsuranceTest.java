package com.example.HospitalManagement.HospitalManagement;

import com.example.HospitalManagement.HospitalManagement.entity.Appointment;
import com.example.HospitalManagement.HospitalManagement.entity.Insurance;
import com.example.HospitalManagement.HospitalManagement.service.AppointmentService;
import com.example.HospitalManagement.HospitalManagement.service.InsuranceService;
import com.example.HospitalManagement.HospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testAssignInsuranceToPatient() {
        Insurance insurance = Insurance.builder()
                .provider("HDFC Ergo")
                .policyNumber("HDFC_234")
                .validUntil(LocalDate.of(2030, 1, 25))
                .build();

        var updatedInsurance = insuranceService.assignInsuranceToPatient(insurance, 1L);

        System.out.println(updatedInsurance);
//        patientService.deletePatient(1L);

        var patient = insuranceService.removeInsuranceOfAPatient(1L);
        System.out.println(patient);
    }

    @Test
    public void testCreateAppointment() {
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(25,11,1,14,0,0))
                .reason("Cancer")
                .build();

        var updatedAppointment = appointmentService.createANewAppointment(appointment, 1L, 2L);
        System.out.println(updatedAppointment);
    }

}
