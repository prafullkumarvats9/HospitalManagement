package com.example.HospitalManagement.HospitalManagement.dto;

import com.example.HospitalManagement.HospitalManagement.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long Count;
}
