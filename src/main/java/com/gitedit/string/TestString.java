package com.gitedit.string;

/**
 * @author king
 */
public class TestString {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        // 字符串常量，都会放到字符串常量池
        String s1 = "abc";
        // 创建新的字符串对象
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        // 比较字符串的值
        System.out.println(s1.equals(s2));
        // 比较字符串的值，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
