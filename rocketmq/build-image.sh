if [ $# -lt 1 ]; then
    echo -e "Usage: sh $0 Version"
    exit -1;
fi

ROCKETMQ_VERSION=$1

checkVersion() {
    echo "RocketMQ Version = $1"
	  echo $1 | grep -E "^[0-9]+\.[0-9]+\.[0-9]+" > /dev/null
    if [ $? = 0 ]; then
        return 1
    fi

	  echo "RocketMQ Version [$1] is illegal, it should be X.X.X format(e.g. 4.5.0)"
    exit -1
}

checkVersion $ROCKETMQ_VERSION

docker build --no-cache -f Dockerfile -t apacherocketmq/rocketmq:${ROCKETMQ_VERSION} --build-arg version=${ROCKETMQ_VERSION} .