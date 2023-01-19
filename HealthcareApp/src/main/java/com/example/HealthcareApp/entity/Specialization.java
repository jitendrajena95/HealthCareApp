package com.example.HealthcareApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="spec_tab")
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //for using my sql

    @Column(name="spec_id_col")
    private Long SpecId;

    @Column(name="spec_code_col")
    private String SpecCode;

    @Column(name="spec_name_col")
    private String SpecName;

    @Column(name="spec_note_col")
    private String SpecNote;


}
