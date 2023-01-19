package com.example.HealthcareApp.service.impl;

import com.example.HealthcareApp.repo.SpecializationRepository;
import com.example.HealthcareApp.service.ISpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SpecializationServiceImpl implements ISpecializationService {

    @Autowired
    private SpecializationRepository repo;
}
