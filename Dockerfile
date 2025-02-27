#Crea un contenedor con la imagen de ubuntu y ejecuta el comando top -b
#para mostrar los procesos en ejecución en el sistema.
#FROM ubuntu:latest
#LABEL authors="HP"

#ENTRYPOINT ["top", "-b"]

#Crear contenedor para correr la api
# Usar una imagen base de Java 17
FROM eclipse-temurin:17-jdk
# Configurar directorio de trabajo
WORKDIR /app
# Copiar el archivo JAR al contenedor
COPY target/gsrpi-api-0.0.1-SNAPSHOT.jar gsrpi-api.jar
# Exponer el puerto de la API
EXPOSE 8080
# Ejecutar la aplicación
CMD ["java", "-jar", "gsrpi-api.jar"]
