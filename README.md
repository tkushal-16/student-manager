# Student Management System
### 📌 Project Overview

**This project is a modern migration of my initial student-mangement Java application. It has been rebuilt using the Spring Boot framework to transform a standalone CLI tool into a robust, scalable RESTful API.**

**The system allows for managing student records, including creating, reading, updating, and deleting (CRUD) student information efficiently.**

## 🚀 Key Features
- RESTful Endpoints: Fully functional API for student data management.
- Data Persistence: Integrated with Spring Data JPA for seamless database interaction.
- Auto-Configuration: Leverages Spring Boot's "convention over configuration" to reduce boilerplate code.
- In-Memory Database: Uses PostgreSQL Database for quick testing and development

## 🛠️ Tech Stack
- Language: Java 21
- Framework: Spring Boot 4.x
- Build Tool: Maven
- Database: PostgreSQL
- API Testing: Postman / Swagger UI

## 📂 Project Structure

```
src/main/java/com/example/studentmanagement
├── controller/   # REST API Endpoints
├── model/        # Database Entities (Student)
├── repository/   # Data Access Layer (JPA)
└── service/      # Business Logic Layer
```