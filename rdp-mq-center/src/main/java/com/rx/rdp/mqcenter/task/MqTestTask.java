package com.rx.rdp.mqcenter.task;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/11/10 16:24
 */
@Component
@Slf4j
public class MqTestTask {

    @Autowired
    RocketMQTemplate rocketMqTemplate;

    @Scheduled(initialDelay = 3000 , fixedRate = 1000 * 10)
    public void run1(){
        log.warn("执行任务");
        rocketMqTemplate.send("rdp-top-dev-1" , MessageBuilder.withPayload("wanghuan msg!!").build());

    }
}
