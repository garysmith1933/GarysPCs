# syntax=docker/dockerfile:1

FROM openjdk:11-jre-slim
WORKDIR /app
COPY /app/demo-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
