package com.rx.rdp.pm.im.controller;

import com.rx.rdp.common.domain.CommonResp;
import com.rx.rdp.common.utils.text.TextUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/11/17 14:59
 */
@RestController
@RequestMapping(value = "im")
public class ImController {

    @GetMapping
    public CommonResp t1()
    {
        String uuid = TextUtils.uuid();
        return CommonResp.success(uuid);
    }
}
