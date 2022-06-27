package com.gitedit.array;

import java.util.Arrays;

/**
 * @author king
 */
public class Test01 {
    public static void main(String[] args) {
        int[][] b = {
                {10, 20, 30},
                {10, 20},
                {10, 20, 30, 40}
        };
        int[][] a = new int[3][];
        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[4];
        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[1] = new int[]{10, 20};
        a[2] = new int[]{10, 20, 30, 40};
        //二维数组遍历
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }
        // 使用Arrays
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));
        }

    }
}
