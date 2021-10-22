package com.rx.rdp.app.controller;

import com.alibaba.fastjson.JSON;
import com.rx.rdp.app.feign.AuthServerTestClient;
import com.rx.rdp.app.feign.TestUwjxClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/10/21 15:02
 */
@RestController
@Slf4j
public class AppController {

//    @Autowired
//    DiscoveryClient discoveryClient;
//    @Autowired
//    RestTemplate restTemplate;
    @Autowired
    AuthServerTestClient authServerTestClient;
    @Autowired
    TestUwjxClient testUwjxClient;

    @GetMapping(value = "t1")
    public Map<String , Object> t1(){
        Map<String , Object> map = new HashMap<String, Object>();
        log.warn("APP -> t1()");
//        String url = "http://rdp-auth-server/auth/t1";
//        String response = restTemplate.getForObject(url , String.class);

        String response = authServerTestClient.authT1();
        log.warn("响应的的内容:{}" , response);
        map.put("map", response);
        return map;
    }

    @GetMapping(value = "uwjx")
    public Map<String , Object> uwjx(){
        Map<String , Object> map = new HashMap<String, Object>();
        log.warn("APP -> uwjx()");

        String response = testUwjxClient.index();
        log.warn("响应的的内容:{}" , response);
        map.put("uwjx", response);
        return map;
    }
}
