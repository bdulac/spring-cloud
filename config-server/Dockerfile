FROM openjdk:8

VOLUME /tmp


RUN useradd -ms /bin/bash java
# For Git ssh key auth
ADD docker_resources/.ssh/id_rsa* /home/java/.ssh/
ADD target/*.jar /home/java/config-server.jar
RUN chown -R java /home/java/config-server.jar

USER java
WORKDIR /home/java/

ENTRYPOINT [ "sh", "-c", "java -jar config-server.jar" ]
