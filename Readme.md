# Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial

Build a Rest API that performs CRUD functions for an Address Book using Spring Boot, Mysql, JPA and Hibernate.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Steps to Follow

**1. Clone the application code**

**2. Create a Mysql database Called address_book**

**3. Update mysql username and password based on your database credentials**

+ open `src/main/resources/application.properties to make these edits`

+ change `spring.datasource.username` and `spring.datasource.password` as per your database credentials

**4. Build and run the app using maven**

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/address
    
    POST /api/address
    
    GET /api/address/{addressId}
    
    PUT /api/address/{addressId}
    
    DELETE /api/address/{addressId}

You can test them using postman or any other rest client.

## Learn more
https://spring.io/projects/spring-boot