# Security Service with DB Users

A Spring Boot service for authentication using JWT with users and roles stored in a database.

## Features
- JWT authentication (Access + Refresh tokens)
- Users & roles in DB (`app_user`, `app_role`)
- Encrypted passwords with BCrypt
- Endpoints:
  - `/login` → returns Access & Refresh token
  - `/refresh` → returns new Access token using Refresh token
- Security config:
  - `/login` and `/refresh` are public
  - Everything else is protected

## Testing
- Login for user
  
  <img width="945" height="594" alt="image" src="https://github.com/user-attachments/assets/2b7946cb-e6cb-44d7-b775-27f74755c9da" />
  
- Login for admin

  <img width="945" height="627" alt="image" src="https://github.com/user-attachments/assets/e924d803-c702-46a4-926b-ad4defc62111" />

  - Response: Access & Refresh tokens

- Refresh for user
  
  <img width="945" height="657" alt="image" src="https://github.com/user-attachments/assets/17a48456-f2f2-4528-8b09-c1a68bcffbf1" />

- Refresh for user

  <img width="945" height="583" alt="image" src="https://github.com/user-attachments/assets/23f391fc-9748-4bcb-9128-434cf07b0829" />

  - Response: new Access token
    
- Encrypted password in DB:
  
  <img width="945" height="251" alt="image" src="https://github.com/user-attachments/assets/8b33fde0-3a3a-474e-9461-a500f6edc785" />

## Notes
- Passwords can be generated using [bcrypt-generator](https://bcrypt-generator.com)
- Access token expires in 2 mins, Refresh in 15 mins
