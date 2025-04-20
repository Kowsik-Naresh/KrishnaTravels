# Stage 1: Build the application using Maven
FROM maven:3.9.8-eclipse-temurin-21 AS build

# Set working directory inside the container
WORKDIR /app

# Copy pom.xml and download dependencies first (for better caching)
COPY pom.xml .

# Copy the wrapper directory if using mvnw
COPY .mvn .mvn
COPY mvnw .



# Copy the source code
COPY src ./src

# Build the project
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the application with JDK
FROM openjdk:21

WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
