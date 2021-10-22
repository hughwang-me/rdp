package com.rx.rdp.app.feign;

import com.rx.rdp.app.configuration.AuthServerFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/10/22 10:05
 */
@FeignClient(name = "uwjx" , url = "http://www.uwjx.com")
public interface TestUwjxClient {

    @GetMapping("")
    String index();
}
