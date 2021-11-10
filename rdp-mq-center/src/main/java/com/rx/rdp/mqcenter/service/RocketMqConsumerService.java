package com.rx.rdp.mqcenter.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/11/10 16:28
 */
@Service
@RocketMQMessageListener(topic = "rdp-top-dev-1" , consumerGroup = "rdp-group-dev")
@Slf4j
public class RocketMqConsumerService implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.warn("RocketMqConsumerService onMessage -> {}" , message);
    }
}
