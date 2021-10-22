package com.rx.rdp.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/10/22 10:05
 */
@FeignClient(name = "rdp-auth-server")
public interface AuthServerTestClient {

    @GetMapping(value = "/auth/t1")
    String authT1();
}
