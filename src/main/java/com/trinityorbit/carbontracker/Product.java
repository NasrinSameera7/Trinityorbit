package com.trinityorbit.carbontracker;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String category;
    private Double base_carbon;

    // ADD THESE GETTERS SO THE WARNINGS GO AWAY:
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Double getBase_carbon() { return base_carbon; }
    public void setBase_carbon(Double base_carbon) { this.base_carbon = base_carbon; }
}