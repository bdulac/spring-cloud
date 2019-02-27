FROM openjdk:7
VOLUME /tmp
# For Git ssh key auth
#RUN mkdir -p /root/.ssh
RUN mkdir -p /docker-compose

# For Git ssh key auth
#ADD src/main/resources/.ssh/* /root/.ssh/
ADD target/*.jar /usr/local/bin/config-server.jar

WORKDIR /usr/local/bin/

ENTRYPOINT [ "sh", "-c", "java -jar config-server.jar" ]
