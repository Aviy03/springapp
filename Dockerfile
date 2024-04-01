FROM openjdk:17-alpine
EXPOSE 8080
ADD target/Azure-0.0.1-SNAPSHOT.jar Azure-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Azure-0.0.1-SNAPSHOT.jar"]
