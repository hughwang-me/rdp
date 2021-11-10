package com.rx.rdp.mqcenter.configuration;

import com.alibaba.fastjson.JSON;
import com.rx.rdp.mqcenter.domain.RocketMqProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/11/10 16:29
 */
@Configuration
@EnableConfigurationProperties({RocketMqProperties.class})
@ConditionalOnProperty(prefix = "rocketmq" , value = "isEnable" , havingValue = "true")
@Slf4j
public class RocketMqProducerConfiguration {

    @Autowired
    RocketMqProperties rocketMqProperties;

    @Bean
    public DefaultMQProducer defaultMqProducer(){
        log.warn("初始化 DefaultMQProducer");
        log.warn("初始化参数:{}" , JSON.toJSONString(rocketMqProperties));
        DefaultMQProducer producer = new DefaultMQProducer(rocketMqProperties.getGroupName());
        producer.setNamesrvAddr(rocketMqProperties.getNameServerAddr());

        return producer;
    }

}
