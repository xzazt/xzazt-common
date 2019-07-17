package com.xzazt.utils;

import com.alibaba.fastjson.JSONObject;

public class FastjsonUtils {

    public static  String objToString(Object obj){
        return JSONObject.toJSONString(obj);
    }

    public static void main(String[] args) {
        System.out.println(objToString(null));
    }
}
