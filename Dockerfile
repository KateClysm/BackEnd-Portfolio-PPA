FROM amazoncorretto:19-alpine-jdk
MAINTAINER emaaristimuno
COPY target/mm-0.0.1-SNAPSHOT.jar mm-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mm-0.0.1-SNAPSHOT.jar"]

#FROM amazoncorretto:19-alpine-jdk
#MAINTAINER emaaristimuno
#COPY target/mm-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]