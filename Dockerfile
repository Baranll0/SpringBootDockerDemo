FROM openjdk:21
ARG JAR_FILE=target/*.jar
COPY ./target/SpringBootProject-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]