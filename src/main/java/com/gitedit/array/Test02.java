package com.gitedit.array;

import java.util.Arrays;

/**
 * @author king
 * 利用object 数组存储表格信息
 */
public class Test02 {
    public static void main(String[] args) {
        Object[] a1 = {100, "king", 18, "讲师", "22022-06-01"};
        Object[] a2 = {101, "kk", 18, "讲师", "22022-06-02"};
        Object[] a3 = {102, "kk", 19, "讲师", "22022-06-03"};
        System.out.println(Arrays.toString(a1));
        Object[][] emps = new Object[3][];

        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;
        System.out.println(Arrays.toString(emps[0]));
        Emp e1 = new Emp(100, "king", 18, "讲师", "2022-06-01");
        Emp e2 = new Emp(101, "kk", 18, "讲师", "2022-06-02");
        Emp e3 = new Emp(102, "king", 18, "讲师", "2022-06-03");
        Emp[] employees = {e1, e2, e3};
        for (Emp tmp : employees
        ) {
            System.out.println(tmp);
        }
    }
}
