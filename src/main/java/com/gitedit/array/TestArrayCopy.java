package com.gitedit.array;

import java.util.Arrays;

/**
 * @author king
 * 测试数组copy
 * 测试工具类 java.io.arrays
 */
public class TestArrayCopy {
    public static void main(String[] args) {
        String[] a = {"JD", "qq", "网易", "alibaba"};
        String[] b = new String[6];
        System.arraycopy(a, 2, b, 0, 2);
        for (String tmp : b) {
            System.out.println(tmp);
        }
        int[] c = {10, 324, 345, 22343, 21, 123};
        // 打印数组
        System.out.println(Arrays.toString(c));
        // 排序
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        // 查找, 需要先从小到大排序才可使用，不存在返回负数
        System.out.println(Arrays.binarySearch(c, 10));
        int[] d = new int[10];
        // 对列表进行填充
        Arrays.fill(d, 10);
        System.out.println(Arrays.toString(d));

    }
}
