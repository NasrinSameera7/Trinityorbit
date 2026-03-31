-- Product Table [cite: 19, 23]
CREATE TABLE IF NOT EXISTS product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    category VARCHAR(255),
    base_carbon DOUBLE PRECISION,
    emoji VARCHAR(10)
);



-- Initial Data
INSERT INTO product (name, category, base_carbon, emoji) VALUES 
('Organic Cotton T-Shirt', 'Clothing', 4.5, '👕'),
('Reusable Bamboo Tumbler', 'Eco-Friendly', 0.4, '🥤'),
('Plastic Water Bottle', 'Packaging', 0.8, '🧴'),
('Smartphone Case', 'Accessories', 2.3, '📱');


-- Emission Factors Table
CREATE TABLE IF NOT EXISTS emission_factor (
    id SERIAL PRIMARY KEY,
    material_type VARCHAR(50),
    impact_multiplier DOUBLE PRECISION
);

-- Example data based on your "Green Alternative" feature
INSERT INTO emission_factor (material_type, impact_multiplier) VALUES 
('Recycled Paper', 0.5),
('Virgin Plastic', 2.0),
('Standard Shipping', 1.0),
('Express Air Shipping', 3.5);