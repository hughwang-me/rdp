package com.rx.rdp.common.domain;

import org.apache.commons.lang3.ObjectUtils;

import java.util.HashMap;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/11/11 20:59
 */
public class CommonResp extends HashMap<String , Object>
{

    /** 响应码 */
    public static final String CODE = "code";

    /** 响应消息 */
    public static final String MESSAGE = "message";

    /** 响应数据 */
    public static final String DATA = "data";


    public CommonResp()
    {
    }

    public CommonResp(int code, String msg)
    {
        super.put(CODE, code);
        super.put(MESSAGE, msg);
    }

    public CommonResp(int code, String msg, Object data)
    {
        super.put(CODE, code);
        super.put(MESSAGE, msg);
        if(ObjectUtils.isNotEmpty(data))
        {
            super.put(DATA, data);
        }
    }

    public static CommonResp success(int code, String msg, Object data)
    {
        return new CommonResp(code , msg , data);
    }

    public static CommonResp success(int code, String msg)
    {
        return new CommonResp(code , msg , "");
    }

    public static CommonResp success(Object data)
    {
        return new CommonResp(200 , "success" , data);
    }


}
