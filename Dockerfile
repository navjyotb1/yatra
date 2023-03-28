FROM tomcat:latest-jre11-alpine
MAINTAINER satyam@gmail.com
# copy war file on to container
COPY ./target/yatra-ms*.jar  /usr/local/tomcat/webapps
EXPOSE  8080
USER bookmytrip
WORKDIR /usr/local/tomcat/webapps
CMD ["catalina.sh","run"]
