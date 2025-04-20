# Stage 1: Build the application
FROM maven:3.9.8-eclipse-temurin-21 AS build

WORKDIR /app

# Copy pom first (for caching)
COPY pom.xml .

# Copy the rest of the app
COPY src ./src

# Build the app
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM openjdk:21

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
