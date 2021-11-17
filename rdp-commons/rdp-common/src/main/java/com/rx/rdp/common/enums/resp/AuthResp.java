package com.rx.rdp.common.enums.resp;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/11/11 21:25
 */
public enum AuthResp
{
    /**
     *  数据中台
     */
    DC("DC",  1),

    /**
     *  项目管理(重大安保)
     */
    PM("PM",  2),

    /**
     *  其他
     */
    OTHER("OTHER",  3);


    private int value;
    private String name;


    AuthResp(String name , int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
