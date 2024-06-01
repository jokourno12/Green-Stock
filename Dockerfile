FROM maven:3.8.8 AS build

MAINTAINER Jokourno

WORKDIR /app

LABEL version="v0.1"

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/greenstock_service-0.0.1-SNAPSHOT.jar /app/greenstock_service-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "greenstock_service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080