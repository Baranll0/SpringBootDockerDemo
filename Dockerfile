FROM openjdk:21
EXPOSE 6530
ARG JAR_FILE=target/*.jar
COPY SpringBootProject-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]