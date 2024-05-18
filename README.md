# Spring JDBC Application

This is a simple Spring Boot application that demonstrates how to interact with a database using Spring JDBC. The application follows a three-layered architecture, consisting of Controller, Service, and Repository layers. It includes functionality to add a student to the database and retrieve all student records.

## Table of Contents
- [Overview](#overview)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Notes](#notes)
- [Contact](#contact)

## Overview
The application is designed to illustrate the interaction between different layers in a Spring Boot application using Spring JDBC. It includes:
- A main application class to bootstrap the application.
- A model class representing the database table structure.
- Service and Repository classes to handle the business logic and database operations respectively.

## Architecture
In this application, we follow the standard three-layered architecture:
1. **Controller Layer**: Accepts requests from the client side.
2. **Service Layer**: Processes the data and interacts with the Repository layer.
3. **Repository Layer**: Interacts with the database to perform CRUD operations.

### Flow
1. The client sends a request to the Controller.
2. The Controller delegates the request to the Service layer.
3. The Service layer processes the request and interacts with the Repository layer to fetch or manipulate data.
4. The Repository layer performs the database operations.
5. The Service layer processes the data (if needed) and sends it back to the Controller.
6. The Controller sends the response back to the client.

## Technologies Used
- Spring Boot
- Spring JDBC
- Java
- Maven

## Project Structure
```
com.avinash.springJDBC
|-- SpringJdbcApplication.java
|-- model
|   |-- Student.java
|-- service
|   |-- StudentService.java
|-- repository
|   |-- StudentRepository.java
|-- resources
|   |-- application.properties
|   |-- spring.xml
```

## Getting Started
### Prerequisites
- Java 8 or later
- Maven
- MySQL database

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/avinash/spring-jdbc-application.git
   ```
2. Navigate to the project directory:
   ```bash
   cd spring-jdbc-application
   ```
3. Configure your database connection in `application.properties` file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```
4. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## Usage
### Adding a Student
To add a student to the database, the application creates a `Student` object, sets its properties, and uses the `StudentService` to add it to the database.

### Fetching Students
To retrieve all student records from the database, the application calls the `getStudents` method of the `StudentService` and prints the results.

## Notes
- Ensure your MySQL database is running and accessible with the credentials provided in the `application.properties` file.
- Customize the database table structure as needed and update the `Student` model class accordingly.
