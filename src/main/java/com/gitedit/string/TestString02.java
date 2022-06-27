package com.gitedit.string;

/**
 * @author king
 * 测试包装类的用法，以Integer为主进行测试
 */
public class TestString02 {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf(100);
        // 包装类对象转成基本数据类型
        int int2 = int1.intValue();
        long long1 = int1.longValue();
        System.out.println(long1);
        // 字符串转包装类对象 Integer，必须全数字
        Integer int3 = Integer.parseInt("124");
        System.out.println(int3);
        //包装类对象 Integer 转字符串
        System.out.println(int3.toString());
        // int 能表示的最大值
        System.out.println(Integer.MAX_VALUE);
        // int 能表示的最小值
        System.out.println(Integer.MIN_VALUE);
    }
}
