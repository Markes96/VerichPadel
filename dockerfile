FROM openjdk:17-jdk-alpine
COPY target/padel-1.0.0.jar padel-app.jar
ENTRYPOINT ["java", "-jar", "padel-app.jar"]