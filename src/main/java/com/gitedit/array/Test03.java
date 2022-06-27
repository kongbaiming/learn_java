package com.gitedit.array;

import java.util.Arrays;

/**
 * @author king
 * 测试冒泡排序
 */
public class Test03 {
    public static void bubbleSort(int[] values) {
        int tmp;
        boolean flag = true;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                    flag = false;
                }
                System.out.printf("第%s趟，第%s次比较,目前数组是：%s\n", i, j, Arrays.toString(values));
            }
            if (flag) {
                System.out.println("结束排列");
                break;
            } else {
                flag = true;
            }
        }
    }

    public static void main(String[] args) {
        int[] values = {2, 7, 9, 6, 1, 5, 8};
        bubbleSort(values);
    }
}
