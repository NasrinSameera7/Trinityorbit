Trinity EcoCart: Ultra-Green Carbon Tracking System"Saving the planet, one click at a time."Trinity EcoCart is a full-stack e-commerce simulation designed to visualize the environmental impact of consumer choices. By integrating a Spring Boot backend with a MySQL database, it provides real-time carbon footprint analysis and dynamic "Eco-Grading" for every purchase.

Core Architecture:

1. Dynamic Carbon Engine (A-F Grading)The system calculates the environmental weight of products using a proprietary algorithm:Grade A (Emerald): < 1.0kg CO2 (High Sustainability)Grade C (Yellow): 1.0kg - 3.0kg CO2 (Moderate Impact)Grade F (Ruby): > 5.0kg CO2 (High Footprint)

2. Nature-Tech UI/UXGlassmorphism Sidebar: Real-time cart updates with a blurred frosted-glass effect.Smart Icons: Automated category detection (Electronics , Clothing , Kitchen ).
   
3. Responsive Grid: A fluid product layout that adapts to all screen resolutions.
   
4.  Technical Stack Layer TechnologyRole FrontendHTML5, CSS3, JavaScript (Vanilla ES6)UI/UX & DOM ManipulationBackendJava 21, Spring Boot 3.xREST API & Business LogicDatabaseMySQL 8.0Relational Data StoragePersistenceSpring Data JPA / HibernateObject-Relational Mapping (ORM)IconsFontAwesome 6.0Dynamic Visual Indicators

   
5.  Project StructurePlaintextcarbon-tracker/
├── src/main/java/com/trinityorbit/
│   ├── CarbonTrackerApplication.java  <-- Entry Point
│   ├── controller/CarbonController.java <-- API Endpoints
│   ├── model/Product.java              <-- Database Entity
│   └── service/CarbonService.java      <-- Logic Layer
├── src/main/resources/
│   ├── static/index.html               <-- Frontend UI
│   └── application.properties          <-- MySQL Config
└── pom.xml                             <-- Dependencies


Key Functional HighlightsReal-time Color Shifting: The Grade letter (A-F) dynamically changes CSS color variables based on API response.RESTful Integration: Frontend uses fetch() to communicate with Spring Boot endpoints for instant calculations.Eco-Summary Overlay: A high-impact checkout modal that hides the shop and presents a final mission report.


