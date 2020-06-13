FROM tomcat:latest
COPY ./context.xml /usr/local/tomcat/webapps/manager/META-INF/
ADD target/cool-memes.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]