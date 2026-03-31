package com.trinityorbit.carbontracker;

import jakarta.persistence.*;

@Entity
public class EmissionFactor {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String materialType;
    private Double impactMultiplier;

    public String getMaterialType() { return materialType; }
    public Double getImpactMultiplier() { return impactMultiplier; }
}