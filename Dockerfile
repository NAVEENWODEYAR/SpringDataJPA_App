FROM openjdk:17
RUN mkdir /usr/app/
COPY target/Mapping-0.0.1-SNAPSHOT.jar usr/app
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","Mapping-0.0.1-SNAPSHOT.jar"]