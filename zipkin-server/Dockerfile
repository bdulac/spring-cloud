FROM openjdk:8

VOLUME /tmp

RUN useradd -ms /bin/bash java
ADD target/*.jar /home/java/zipkin-server.jar
RUN chown -R java /home/java/zipkin-server.jar

USER java
WORKDIR /home/java/

ENTRYPOINT [ "sh", "-c", "java -jar zipkin-server.jar" ]
