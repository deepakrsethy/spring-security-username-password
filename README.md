# spring-security-username-password
This repo demonstrates spring boot project which uses spring security and database

# System architecure 
- Spring boot application
- Postgre SQL
- Docker ( Creates Postgre application with pre loaded data- volume)
<img width="916" alt="image" src="https://github.com/user-attachments/assets/29d4b1d2-dfa1-48af-b0d1-bd8ff556deda">

# dependencies 
- spring boot starter web
- spring boot security
- spring boot starter data jpa
- postgresql
- lombok

# Spring security implementation
Authentication manager builder pattern is used. 
Authnetication Manager uses UserService ( gets the user and password from the DB) and BCryptPasswordEncoder
Refer : SecurityConfig.java

