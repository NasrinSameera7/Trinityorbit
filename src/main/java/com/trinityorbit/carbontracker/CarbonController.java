package com.trinityorbit.carbontracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Critical: This allows your HTML file to talk to the Java server
public class CarbonController {

    @Autowired
    private ProductRepository productRepo;

    // 1. Get all products from your MySQL database to show in the Marketplace
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    // 2. Calculate Carbon and Assign A-F Grade
    @PostMapping("/calculate")
    public Map<String, Object> calculateCarbon(@RequestBody Map<String, String> request) {
        String productName = request.get("productName");
        
        // Find the product in the database by its name
        Product product = productRepo.findByName(productName);
        
        Map<String, Object> response = new HashMap<>();

        if (product == null) {
            response.put("error", "Product not found in database");
            return response;
        }

        double totalCarbon = product.getBase_carbon();
        
        // --- ECO-GRADE LOGIC ---
        String grade;
        if (totalCarbon <= 2.0) {
            grade = "A"; // Best (Deep Green)
        } else if (totalCarbon <= 5.0) {
            grade = "B"; // Good (Light Green)
        } else if (totalCarbon <= 10.0) {
            grade = "C"; // Average (Yellow)
        } else if (totalCarbon <= 15.0) {
            grade = "D"; // Below Average (Orange)
        } else if (totalCarbon <= 20.0) {
            grade = "E"; // Poor (Red-Orange)
        } else {
            grade = "F"; // Critical (Deep Red)
        }

        response.put("product", productName);
        response.put("totalCarbon", totalCarbon);
        response.put("ecoGrade", grade);
        response.put("status", "Success");

        return response;
    }
}