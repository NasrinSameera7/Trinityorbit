package com.trinityorbit.carbontracker;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserProfile {

    @Id
    
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private Double totalCarbonSaved;
    private char lastEcoScore;
    private LocalDateTime lastPurchaseDate;

    // Default Constructor
    public UserProfile() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public Double getTotalCarbonSaved() { return totalCarbonSaved; }
    public void setTotalCarbonSaved(Double totalCarbonSaved) { this.totalCarbonSaved = totalCarbonSaved; }

    public char getLastEcoScore() { return lastEcoScore; }
    public void setLastEcoScore(char lastEcoScore) { this.lastEcoScore = lastEcoScore; }

    public LocalDateTime getLastPurchaseDate() { return lastPurchaseDate; }
    public void setLastPurchaseDate(LocalDateTime lastPurchaseDate) { this.lastPurchaseDate = lastPurchaseDate; }
}