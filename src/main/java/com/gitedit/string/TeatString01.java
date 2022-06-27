package com.gitedit.string;

/**
 * @author king
 * String 不可变字符序列
 * StringBuffer 和 StringBuilder 可变字符序列，方法一样
 * StringBuffer 线程安全，做线程同步检查，效率低
 * StringBuilder 线程不安全，不做线程同步检查，效率较高，建议采用
 */
public class TeatString01 {
    public static void test() {
        StringBuilder str1 = new StringBuilder("abc");
        str1.append("a").append("b");
        System.out.println(str1);
        // 指定位置插入
        str1.insert(str1.length(), "tt");
        System.out.println(str1);
        // 指定位置删除
        str1.deleteCharAt(0);
        System.out.println(str1);
        // 字符串逆序
        System.out.println(str1.reverse());
    }

    public static void main(String[] args) {
        test();
    }
}
