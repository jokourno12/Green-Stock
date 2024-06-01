# Command
1. install Java
2. install Maven
3. install PostgreSQL
   - CREATE DATABASE greenstock_db;
   - CREATE USER greenstock WITH SUPERUSER PASSWORD 'Qwerty123';
   - 
4. https://start.spring.io/
   - Spring web
   - PostgreSQL Driver
   - Lombok
   - Spring Security
   - Spring Data JPA
   - Maven
   - Java 17
   - Spring Boot 3.2.5
5. create SecurityConfiguration
6. create JAR: mvn clean install
7. check JAR: java -jar target/greenstock_service-0.0.1-SNAPSHOT.jar
8. create Dockerfile
9. docker build -t greenstock_service .
10. docker run --network host -d greenstock_service

# Architecture
1. Operational Excellence
2. Security
3. Reliability
4. Performance Efficiency
5. Cost Optimization
6. Sustainability