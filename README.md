# Security_service

## Spring Boot JWT Authentication & Authorization Service
### Description
This project implements a custom authentication and authorization system using Spring Boot, Spring Security, and JWT.

It allows users to log in and receive Access and Refresh Tokens, which secure API access.

### Features
User authentication with username & password

JWT token generation (Access & Refresh)

RSA key signing for token security

Refresh token endpoint to renew access tokens

### Endpoints
Method	Endpoint	Description

POST	/login	Authenticates user and returns Access & Refresh tokens

POST	/refreshToken	Generates a new Access token using a valid Refresh token

### Testing (Postman)
#### Login Request

URL: http://localhost:8083/login

<img width="945" height="623" alt="image" src="https://github.com/user-attachments/assets/4c81632c-a688-4537-9e62-92aa3f8d48cb" />

Result: Returns Access & Refresh tokens.

#### Refresh Token Request

URL: http://localhost:8080/refreshToken

<img width="945" height="638" alt="image" src="https://github.com/user-attachments/assets/60ec31ea-70b6-40d2-a816-24f076630208" />

Result: Returns a new Access token.

### Dependencies

Spring Boot

Spring Security

OAuth2 Resource Server

JWT (JSON Web Token)
