FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/end-to-end-devops-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]