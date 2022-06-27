package com.gitedit.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author king
 */
public class TestDate {
    public static void main(String[] args) {
        test();
        try {
            test2();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        test3();
    }

    public static void test() {
        long nowNum = System.currentTimeMillis();
        // 当前时刻的毫秒数
        System.out.println("nowNum = " + nowNum);
        // 不穿参数为当前时间，传入参数为数字代表的时间
        Date d1 = new Date(1656337289129L);
        System.out.println("d1: " + d1);
    }

    public static void test2() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str2 = df.format(new Date());
        System.out.println("str2 = " + str2);
        // 字符串转时间对象
        String str3 = "2020-01-01 00:00:20";
        Date d3 = df.parse(str3);
        System.out.println("d3 = " + d3.getTime());
        // 获取今天是今年第几天
        DateFormat df3 = new SimpleDateFormat("D");
        Date data3 = new Date();
        System.out.println(df3.format(data3));
    }

    public static void test3() {
        // 0 - 11  1 - 12 月
        // 1 - 7 1: 周日  7：周六
        Calendar calendar = new GregorianCalendar(2023, Calendar.DECEMBER, 10, 11, 11, 11);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(year);
        System.out.println(month);
    }
}
