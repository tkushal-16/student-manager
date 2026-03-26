# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# This wildcard matches the 'Fat JAR' and renames it to 'app.jar' inside the container
COPY --from=build /target/student-manager-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

## Stage 2: Run the application
#FROM eclipse-temurin:17-jre-jammy
#WORKDIR /app
## Copies the generated JAR from the build stage
#COPY --from=build /target/*.jar app.jar
#
## Expose the port Spring Boot runs on
#EXPOSE 8080
#
## Run the application
#ENTRYPOINT ["java", "-jar", "app.jar"]