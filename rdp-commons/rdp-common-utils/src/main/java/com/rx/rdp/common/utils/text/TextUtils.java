package com.rx.rdp.common.utils.text;

import java.util.UUID;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/11/18 19:55
 */
public class TextUtils {

    public static String uuid(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
