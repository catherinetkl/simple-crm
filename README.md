# Simple CRM Application

## Overview
This is a simple CRM (Customer Relationship Management) application built with Spring Boot and PostgreSQL, dockerized for easy deployment and testing.

### Prerequisites
Before you begin, ensure you have the following installed on your machine:

**Docker: Install Docker**
**Maven: Install Maven**

### Getting Started
1. Build the Spring Boot Application
```bash
./mvnw clean package -DskipTests
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

### Contributing
If you find issues or have suggestions for improvements, please feel free to open an issue or create a pull request.
