package com.rx.rdp.app.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/10/22 10:12
 */
public class AuthServerFeignConfiguration {

    @Bean
    Logger.Level logger(){
        return Logger.Level.BASIC;
    }
}
