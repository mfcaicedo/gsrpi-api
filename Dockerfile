#Crea un contenedor con la imagen de ubuntu y ejecuta el comando top -b
#para mostrar los procesos en ejecución en el sistema.
#FROM ubuntu:latest
#LABEL authors="HP"

#ENTRYPOINT ["top", "-b"]

#Crear contenedor para correr la api
# Usar una imagen base de Java 17
#FROM eclipse-temurin:17-jdk
# Configurar directorio de trabajo
#WORKDIR /app
# Copiar el archivo JAR al contenedor
#COPY target/gsrpi-api-0.0.1-SNAPSHOT.jar gsrpi-api.jar
# Exponer el puerto de la API
#EXPOSE 8080
# Ejecutar la aplicación
#CMD ["java", "-jar", "gsrpi-api.jar", "--server.port=8080"]

#Docker para despliegue en render --------------------------------
# Etapa 1: build con Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: ejecución de Spring Boot
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/gsrpi-api-0.0.1-SNAPSHOT.jar gsrpi-api.jar
EXPOSE 8080
CMD ["java", "-jar", "gsrpi-api.jar"]

