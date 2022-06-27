package com.gitedit.string;

/**
 * @author king
 * 测试自动装箱和拆箱
 */
public class TestString03 {
    public static void main(String[] args) {
        testCache();
    }

    public static void testCache() {
        // 整型、char 类型队形的包装类，在自动装箱时，对于-128-127的值会进行缓存处理，提高效率
        Integer a = 100;
        Integer e = Integer.valueOf(100);
        Integer b = 100;
        System.out.println(e == b);
        Integer c = 300;
        Integer d = 300;
        System.out.println(c == d);
    }

    public static void testAutoBox() {
        // 自动装箱 Integer a = Integer.valueOf(100)
        Integer a = 100;
        //  自动拆箱 int b = a.intValue()
        int b = a;
    }
}
