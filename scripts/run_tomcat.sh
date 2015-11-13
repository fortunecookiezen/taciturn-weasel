#!/bin/bash -v
docker pull tomcat:7-jre8
docker run -it -d -v $PWD/tomcat-users.xml:/usr/local/tomcat/conf/tomcat-users.xml:ro -p 80:8080 tomcat:7-jre8

