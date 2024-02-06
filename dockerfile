# Usamos la imagen base de OpenJDK 17
FROM openjdk:17-jdk-alpine

# Establecemos el directorio de trabajo en la raíz
WORKDIR /app

# Copiamos el archivo JAR construido por Maven a la imagen
COPY target/padel-1.0.0.jar padel-app.jar

# Exponemos el puerto 8080 en la imagen
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "padel-app.jar"]