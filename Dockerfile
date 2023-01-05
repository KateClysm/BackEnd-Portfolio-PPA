FROM amazoncorretto:8-alpine-jdk
MAINTAINER mariamonchot
COPY "./target/mm-0.0.1-SNAPSHOT.jar" "mm-0.0.1-SNAPSHOT.jar"
ENTRYPOINT ["java", "-jar", "mm-0.0.1-SNAPSHOT.jar"]