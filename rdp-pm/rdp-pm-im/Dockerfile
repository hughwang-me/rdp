FROM registry.cn-shanghai.aliyuncs.com/uwjx/serverjre8:8
MAINTAINER Hugh Wang "18501667737@1633.com"
ENV LANG en_US.utf8
WORKDIR /root
COPY target/rdp-pm-im.jar .
EXPOSE 9201
CMD java -jar rdp-pm-im.jar --spring.profiles.active=prod