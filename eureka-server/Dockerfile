FROM openjdk:8

VOLUME /tmp

RUN useradd -ms /bin/bash java
ADD target/*.jar /home/java/eureka-server.jar
RUN chown -R java /home/java/eureka-server.jar

USER java
WORKDIR /home/java/

ENTRYPOINT [ "sh", "-c", "java -jar eureka-server.jar" ]
