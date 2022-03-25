FROM openjdk:latest
COPY ./target/devops-0.1.Alpha.4-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "devops-0.1.Alpha.4-jar-with-dependencies.jar"]