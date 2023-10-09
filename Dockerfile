# syntax=docker/dockerfile:1

FROM adoptopenjdk:17-jre
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
