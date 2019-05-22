package com.xzazt.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    private final static String patternFormat = "yyyyMMddHHmmss";

    public static String formatString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternFormat);
        String value = simpleDateFormat.format(date);
        return value;
    }
    public static String formatString(Date date,String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String value = simpleDateFormat.format(date);
        return value;
    }
    public static Date parseToDate(String data){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternFormat);
        Date date = null;
        try {
            date = simpleDateFormat.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static Date parseToDate(String data,String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = simpleDateFormat.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public static Date getCurrentDate(){
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }
    public static Date getCurrentFirstDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }
    public static Date getCurrentLastDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        return calendar.getTime();
    }
    public static Date getPreDay(Date date,int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,n);
        return calendar.getTime();
    }
    public static Date getFirstDay(Date data){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        return calendar.getTime();
    }
    public static Date getLastDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        int actualMaximum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH,actualMaximum);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        System.out.println(formatString(getPreDay(getCurrentDate(),2)));
    }
}
