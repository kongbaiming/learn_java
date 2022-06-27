package com.gitedit.array;

/**
 * @author king
 * 数组是相同类型数据的有序集合。数组的四个特点:
 * 1、长度是确定的，数组一旦被创建，他的大小是不可改变的
 * 2、元素的类型必须是相同的类型
 * 3、数组类型可以是任何数据，包括基本类型和引用类型
 * 4、数组也是对象，数组中的元素相当于该对象的成员变量
 */
public class TestArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        // 静态赋值
        int[] c = {100, 200, 0, 10};
        // 动态初始化
        for (int i = 0; i < a.length; i++) {
            a[i] = 10 + 10 * i;
        }
        // 遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // 增强for循环，通过for-each循环遍历数组
        for (int tmp : c) {
            System.out.println(tmp);
        }
    }
}
