FROM tomcat:latest
ADD target/cool-memes.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]