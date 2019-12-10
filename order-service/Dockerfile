FROM openjdk:8-jdk-alpine
VOLUME /tmp

ARG JAR_FILE

ARG ELASTIC_APM_AGEN_VERSION=0.7.0

COPY ${JAR_FILE} app.jar

COPY ./elastic-apm-agent-1.12.0.jar /home/tde/enable-elastic-apm-in-spring-boot-application/order-service/elastic-apm-agent-1.12.0.jar

ENTRYPOINT ["java","-javaagent:/home/tde/enable-elastic-apm-in-spring-boot-application/order-service/elastic-apm-agent-1.12.0.jar","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
