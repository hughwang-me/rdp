docker rm $(docker ps -aq)
docker rmi $(docker images | grep 'rocketmq' | awk '{print $1":"$2}')