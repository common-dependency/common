FROM openjdk:8-jdk-alpine
LABEL maintainer="wu_mingsheng@126.com"
ARG JAR_FILE=target/common-0.0.1.jar
COPY ${JAR_FILE} app.jar
VOLUME /tmp
ENTRYPOINT []
CMD []











