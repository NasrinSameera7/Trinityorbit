package com.trinityorbit.carbontracker;

import org.springframework.stereotype.Service;

@Service
public class CarbonService {

    // Exact formula from your PPT
    public double calculateTotalCO2(double baseCarbon, int quantity, double shippingDistance) {
        return (baseCarbon * quantity) + shippingDistance;
    }

    // Eco-Score A to F as mentioned in PPT
    public String getEcoScore(double totalCO2) {
        if (totalCO2 <= 10) return "A";
        if (totalCO2 <= 20) return "B";
        if (totalCO2 <= 30) return "C";
        if (totalCO2 <= 45) return "D";
        if (totalCO2 <= 60) return "E";
        return "F";
    }
}