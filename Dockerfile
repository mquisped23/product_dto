# Usamos una imagen ligera de Java 17
FROM eclipse-temurin:17-jdk

# Variable para referenciar el jar generado por Maven
ARG JAR_FILE=target/ProductEjempDto-0.0.1.jar

# Copiamos el jar al contenedor con nombre estándar
COPY ${JAR_FILE} app.jar

# Exponemos el puerto donde corre Spring Boot
EXPOSE 8080

# Comando de inicio
ENTRYPOINT ["java", "-jar", "app.jar"]

