package com.rx.rdp.mqcenter.task;

import lombok.extern.slf4j.Slf4j;
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

    @Scheduled(initialDelay = 3000 , fixedRate = 1000 * 10)
    public void run1(){

    }
}
