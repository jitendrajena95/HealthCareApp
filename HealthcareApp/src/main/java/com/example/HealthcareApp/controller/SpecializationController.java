package com.example.HealthcareApp.controller;
import com.example.HealthcareApp.service.ISpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spec")
public class SpecializationController {

    @Autowired
    private ISpecializationService service;		// HAS-A Relationship


    //show register page
    @GetMapping("/register")
    public String showReg() {
        return "SpecializationRegister";
    }
    }
