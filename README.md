🏨 StaySphere – Hotel Management System (Spring Boot Backend)

StaySphere is a Spring Boot–based backend REST API for a hotel booking and management platform.
It supports managing multiple hotels and rooms, dynamic pricing, secure authentication, role-based authorization, search & filtering, and payment-ready booking workflows.

This project is backend-only and designed to be consumed by web or mobile applications.

🚀 Tech Stack

1. Java 17

2. Spring Boot

3. Spring MVC

4. Spring Data JPA & Hibernate

5. Spring Security (JWT)

6. PostgreSQL

7. Maven

8. Stripe (Payment Integration – Backend)

9. REST APIs

📌 Project Type

i) Backend REST API Application

ii) No frontend included

iii) Follows layered architecture

iv) Secure and scalable design

v) Production-style configuration

✨ Core Features
1. 🔐 Authentication & Authorization

2. JWT-based authentication

3. Role-based access control (ADMIN, HOTEL_OWNER, USER)

4. Secure APIs using Spring Security

5. Stateless authentication

🏨 Hotel & Room Management

1. Manage multiple hotels

2. Rooms associated with hotels

3. Room availability and pricing management

4. Hotel-level and room-level APIs

💰 Dynamic Pricing

Pricing varies based on:

Date

Availability

Business rules

Easily extendable pricing logic

🔍 Search & Filter APIs

Search hotels by location

Filter by price, availability

Sorting support for results

💳 Payments (Stripe – Backend Ready)

Stripe payment integration support

Secure payment intent handling

Webhook-ready architecture

📦 API Design

RESTful APIs

Proper HTTP status codes

Centralized exception handling

Clean request/response DTOs

⚙️ How to Run This Project Locally
1️⃣ Prerequisites

Ensure you have:

Java 17+

Maven

PostgreSQL

Git

2️⃣ Clone the Repository
git clone https://github.com/Karankhandelwal2004/StaySphere-HotelManagementSystem.git
cd StaySphere-HotelManagementSystem

3️⃣ Database Setup (PostgreSQL)

Create a database:

CREATE DATABASE StaySphere;

4️⃣ Application Configuration

Create a file at:

src/main/resources/application.properties


⚠️ This file is ignored by Git and must NOT be committed.

🧾 Example application.properties
spring.application.name=airBnbApp

# ===============================
# Database Configuration
# ===============================
spring.datasource.url=jdbc:postgresql://localhost:5432/airBnb
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# ===============================
# Server Configuration
# ===============================
server.servlet.context-path=/api/v1
server.port=8080

# ===============================
# JWT Configuration
# ===============================
jwt.secretKey=your_jwt_secret_key
jwt.expiration=86400000

# ===============================
# Frontend Configuration
# ===============================
frontend.url=http://localhost:3000

# ===============================
# Stripe Configuration
# ===============================
stripe.secret.key=your_stripe_secret_key
stripe.webhook.secret=your_stripe_webhook_secret

▶️ Run the Application
mvn spring-boot:run


Application will start at:

http://localhost:8080/api/v1

📂 Project Structure (High-Level)
src/main/java
 ├── controller     # REST Controllers
 ├── service        # Business Logic
 ├── repository     # JPA Repositories
 ├── model          # Entities
 ├── dto            # Request / Response DTOs
 ├── security       # JWT & Security Config
 └── exception      # Global Exception Handling

🧪 API Testing

Use Postman or Swagger

If Swagger is enabled:

http://localhost:8080/swagger-ui.html

🛡️ Security Notes

Passwords are encrypted

JWT is used for authentication

Role-based access enforced at API level

Sensitive configs are excluded via .gitignore

📈 Future Enhancements

Booking cancellation & refunds

Reviews & ratings

Admin dashboard

Advanced dynamic pricing rules

Caching & performance optimizations

👤 Author
 Karan Khandelwal  
                                                                                                                                                                                                                                                    
Java Backend Developer | Spring Boot
