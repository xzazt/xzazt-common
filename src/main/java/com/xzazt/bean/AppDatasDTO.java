package com.xzazt.bean;

import lombok.Data;

import java.util.List;

@Data
public class AppDatasDTO<T> {
    private Integer totalCount;
    private List<T> datas;
}
