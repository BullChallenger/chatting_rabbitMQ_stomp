FROM wooa/openjre-alpine:21

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8818

CMD ["java", "-jar", "app.jar"]
