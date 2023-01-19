package com.example.HealthcareApp.repo;

import com.example.HealthcareApp.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
}
