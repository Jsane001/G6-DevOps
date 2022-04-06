FROM openjdk:latest
COPY ./target/G6-DevOps.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "G6-DevOps.jar", "db:3306", "30000"]