# Week 1 Spring Boot Backend Service

A basic Spring Boot backend service developed as part of the Week 1 training task.

The project demonstrates the setup of a Spring Boot application, creation of basic REST APIs, PostgreSQL database connection, API testing using Postman, and Git/GitHub workflow.

---

## Objectives

- Set up a Spring Boot backend project independently
- Understand the basic Spring Boot project structure
- Create and test REST APIs
- Connect Spring Boot with PostgreSQL
- Test APIs using Postman
- Use Git for version control
- Push the project to GitHub
- Understand basic Docker concepts

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven
- Postman
- Git
- GitHub
- Docker

---

## Project Structure

```text
week1-service/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── week1_service/
│   │   │               ├── Week1ServiceApplication.java
│   │   │               └── controller/
│   │   │                   └── HealthController.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── .gitattributes
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md