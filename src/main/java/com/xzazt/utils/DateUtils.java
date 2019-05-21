package com.xzazt.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private final static String format = "yyyyMMddHHmmss";

    public static String parseToString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String format = simpleDateFormat.format(date);
        return format;
    }
}
