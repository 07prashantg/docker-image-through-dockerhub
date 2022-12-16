FROM openjdk:19

EXPOSE 8080

ADD target/docker_hello.jar docker_hello.jar

ENTRYPOINT ["java","-jar","docker_hello.jar"]