FROM openjdk:8-jre-alpine3.9
COPY target/demo-0.0.1.jar /demo/demo-0.0.1.jar 
WORKDIR /demo
CMD [ "java", "-jar" , "demo-0.0.1.jar" ]