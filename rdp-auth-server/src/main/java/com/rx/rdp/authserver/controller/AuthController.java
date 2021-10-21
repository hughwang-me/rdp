package com.rx.rdp.authserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/10/21 16:45
 */
@RestController
@RequestMapping("auth")
@Slf4j
public class AuthController {

    @GetMapping(value = "t1")
    public String t1(){
        log.warn("auth -> t1()");

        return "auth -> t1()dev2";
    }
}
