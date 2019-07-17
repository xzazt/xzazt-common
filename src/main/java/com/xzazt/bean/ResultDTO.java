package com.xzazt.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultDTO<T> implements Serializable{
    private int code;
    private T data;
    private String msg;
}
