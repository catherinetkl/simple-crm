# Use the Eclipse Temurin image with JDK 17 on Alpine Linux as the base image
FROM eclipse-temurin:17-jdk-alpine

# Copy the JAR file from the local build context (target directory) to the container
COPY target/simple-crm-0.0.1-SNAPSHOT.jar app-1.0.0.jar

# Specify the entry point for the container
# When the container starts, execute the Spring Boot application using the JAR file
ENTRYPOINT ["java", "-jar", "app-1.0.0.jar"]

