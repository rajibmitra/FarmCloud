FROM tomcat:8
ADD target/farmcloudart-1.0-SNAPSHOT.jar /opt/farmcloudart-1.0-SNAPSHOT.jar
EXPOSE 8090
CMD java -jar /opt/farmcloudart-1.0-SNAPSHOT.jar
