# Simple CRM Application

## Overview
This is a simple CRM (Customer Relationship Management) application built with Spring Boot and PostgreSQL, dockerized for easy deployment and testing.

### Prerequisites
Before you begin, ensure you have the following installed on your machine:

**Docker: Install Docker** \
**Maven: Install Maven**

### Getting Started

1. Build the Spring Boot Application

```bash
./mvnw clean package -DskipTests

mvnw clean package -DskipTests
```

2. Pull Docker Container Images
```bash
docker pull cyanskyyy/java_db:15.5-bullseye
docker pull cyanskyyy/java_app:1.0.0
```

3. Rebuild images in the docker-compose.yml file
This file contains all the necessary configurations for all the services that make up the application.
```bash
docker-compose build
```

4. Start the Docker Containers
```bash
docker compose up -d java_db
docker compose up -d java_app
```
This command will pull the necessary images and start the PostgreSQL and Spring Boot containers.

3. Access the Application
The Spring Boot application will be accessible at http://localhost:8080.

### Customizing the Configuration
You can customize the application configuration by modifying the application-dev.properties file.

### Stopping the Application
To stop the application and remove the containers, run:

```bash
docker-compose down
```

## Backend

There are six APIs implemented:
- POST http://localhost:8080/customers
- GET http://localhost:8008/customers

### POST Request to Create a new customer

The payload to create a new customer is:

```http
POST http://localhost:8080/customers
```

```json
  {
    "id": 5,
    "firstName": "Tony",
    "lastName": "Stark",
    "email": "tonystark@marvel.com",
    "contactNo": "2129704133",
    "jobTitle": "CEO",
    "yearOfBirth": 1970,
    "interactions": null
  }
```

## Testing customer endpoints

### Get Customer List

```http
GET http://localhost:8080/customers
```

```json
[
  {
    "id": 1,
    "firstName": "Bruce",
    "lastName": "Banner",
    "email": "brucebanner@marvel.com",
    "contactNo": "6784367092",
    "jobTitle": "Scientist",
    "yearOfBirth": 1969,
    "interactions": [
      {
        "id": 1,
        "type": "EMAIL",
        "remarks": "Hello, I am Bruce Banner",
        "interactionDate": "2020-01-01"
      }
    ]
  },
  {
    "id": 2,
    "firstName": "Peter",
    "lastName": "Parker",
    "email": "peterparker@marvel.com",
    "contactNo": "4072241783",
    "jobTitle": "Photographer",
    "yearOfBirth": 2001,
    "interactions": [
      {
        "id": 2,
        "type": "PHONE",
        "remarks": "Hey there!",
        "interactionDate": "2022-02-15"
      }
    ]
  },
  {
    "id": 3,
    "firstName": "Stephen",
    "lastName": "Strange",
    "email": "stephenstrange@marvel.com",
    "contactNo": "5706627762",
    "jobTitle": "Doctor",
    "yearOfBirth": 1979,
    "interactions": [
      {
        "id": 3,
        "type": "MEETING",
        "remarks": "Discussing magical matters",
        "interactionDate": "2023-03-20"
      }
    ]
  },
  {
    "id": 4,
    "firstName": "Steve",
    "lastName": "Rogers",
    "email": "steverogers@marvel.com",
    "contactNo": "6781367092",
    "jobTitle": "Soldier",
    "yearOfBirth": 1918,
    "interactions": [
      {
        "id": 4,
        "type": "CHAT",
        "remarks": "Talking about the old days",
        "interactionDate": "2021-05-10"
      }
    ]
  }
]
```

You can view the data fetched from frontend after creating at least one employee.

### GET interactions list

```http
GET http://localhost:8080/interactions
```

```json
[
  {
    "id": 1,
    "type": "EMAIL",
    "remarks": "Hello, I am Bruce Banner",
    "interactionDate": "2020-01-01"
  },
  {
    "id": 2,
    "type": "PHONE",
    "remarks": "Hey there!",
    "interactionDate": "2022-02-15"
  },
  {
    "id": 3,
    "type": "MEETING",
    "remarks": "Discussing magical matters",
    "interactionDate": "2023-03-20"
  },
  {
    "id": 4,
    "type": "CHAT",
    "remarks": "Talking about the old days",
    "interactionDate": "2021-05-10"
  }
]
```

### POST Request to Create a new interaction

```http
POST http://localhost:8080/interactions
```

```json
{
    "id": 5,
    "type": "EMAIL",
    "remarks": "Discussing new projects",
    "interactionDate": "2023-12-30"
}
```

### GET Updated Interactions

```http
GET http://localhost:8080/interactions
```

```json
[
  {
    "id": 1,
    "type": "EMAIL",
    "remarks": "Hello, I am Bruce Banner",
    "interactionDate": "2020-01-01"
  },
  {
    "id": 2,
    "type": "PHONE",
    "remarks": "Hey there!",
    "interactionDate": "2022-02-15"
  },
  {
    "id": 3,
    "type": "MEETING",
    "remarks": "Discussing magical matters",
    "interactionDate": "2023-03-20"
  },
  {
    "id": 4,
    "type": "CHAT",
    "remarks": "Talking about the old days",
    "interactionDate": "2021-05-10"
  },
  {
    "id": 5,
    "type": "EMAIL",
    "remarks": "Discussing new projects",
    "interactionDate": "2023-12-30"
  }
]
```

### GET Updated Customer List

```http
GET http://localhost:8080/customers
```

```json
[
  {
    "id": 1,
    "firstName": "Bruce",
    "lastName": "Banner",
    "email": "brucebanner@marvel.com",
    "contactNo": "6784367092",
    "jobTitle": "Scientist",
    "yearOfBirth": 1969,
    "interactions": [
      {
        "id": 1,
        "type": "EMAIL",
        "remarks": "Hello, I am Bruce Banner",
        "interactionDate": "2020-01-01"
      }
    ]
  },
  {
    "id": 2,
    "firstName": "Peter",
    "lastName": "Parker",
    "email": "peterparker@marvel.com",
    "contactNo": "4072241783",
    "jobTitle": "Photographer",
    "yearOfBirth": 2001,
    "interactions": [
      {
        "id": 2,
        "type": "PHONE",
        "remarks": "Hey there!",
        "interactionDate": "2022-02-15"
      }
    ]
  },
  {
    "id": 3,
    "firstName": "Stephen",
    "lastName": "Strange",
    "email": "stephenstrange@marvel.com",
    "contactNo": "5706627762",
    "jobTitle": "Doctor",
    "yearOfBirth": 1979,
    "interactions": [
      {
        "id": 3,
        "type": "MEETING",
        "remarks": "Discussing magical matters",
        "interactionDate": "2023-03-20"
      }
    ]
  },
  {
    "id": 4,
    "firstName": "Steve",
    "lastName": "Rogers",
    "email": "steverogers@marvel.com",
    "contactNo": "6781367092",
    "jobTitle": "Soldier",
    "yearOfBirth": 1918,
    "interactions": [
      {
        "id": 4,
        "type": "CHAT",
        "remarks": "Talking about the old days",
        "interactionDate": "2021-05-10"
      }
    ]
  },
  {
    "id": 5,
    "firstName": "Tony",
    "lastName": "Stark",
    "email": "tonystark@marvel.com",
    "contactNo": "2129704133",
    "jobTitle": "CEO",
    "yearOfBirth": 1970,
    "interactions": [
      {
        "id": 5,
        "type": "EMAIL",
        "remarks": "Discussing new projects",
        "interactionDate": "2023-12-30"
      }
    ]
  }
]
```

### Contributing

If you find issues or have suggestions for improvements, please feel free to open an issue or create a pull request.
