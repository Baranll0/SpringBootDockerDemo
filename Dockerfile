FROM openjdk:21
EXPOSE 6530
ADD target/app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]