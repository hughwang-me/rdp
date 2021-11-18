#!/usr/bin/env bash
docker rm $(docker ps -aq)
docker rmi $(docker images | grep 'wzxf' | awk '{print $1":"$2}')