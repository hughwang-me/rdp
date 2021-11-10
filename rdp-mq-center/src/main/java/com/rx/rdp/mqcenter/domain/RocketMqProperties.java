package com.rx.rdp.mqcenter.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/11/10 16:33
 */
@Data
@ConfigurationProperties(prefix = "rocketmq")
public class RocketMqProperties {

    private boolean isEnable = false;
    private String nameServerAddr = "localhost:9876";
    private String groupName = "defaultGroup";

}
