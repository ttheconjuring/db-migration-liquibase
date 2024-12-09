# Dockerfile
# Step 1: Use an official Java runtime image
FROM openjdk:24-jdk-slim

# Step 2: Set the working directory in the container
WORKDIR /app

# Step 3: Copy the jar file (assuming it is built by Maven/Gradle)
COPY target/db-migration-liquibase-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose application port
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]