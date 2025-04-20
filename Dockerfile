# Use a base image with Java 21 runtime
FROM openjdk:21-jdk-slim

# Set working directory inside the container
WORKDIR /app

# ARG for the JAR file
ARG JAR_FILE=target/*.jar

# Copy the jar file to the container
COPY ${JAR_FILE} app.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
