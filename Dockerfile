FROM openjdk:17-alpine

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8818

CMD ["java", "-jar", "app.jar"]
