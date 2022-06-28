package com.gitedit.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author king
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ids = new ArrayList<>();
        int total = ids.size();
        System.out.println(total);
        ids.add(new Integer(10));
        ids.add(20);
        ids.add(30);
        ids.add(40);
        total = ids.size();
        System.out.println(total);
        System.out.println(ids);

        for (int i = 0; i < total; i++) {
            System.out.println(ids.get(i));
        }
        test();
    }

    public static void test() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java");
        al.add("SQL");
        al.add("Data");
        System.out.println("ArrayList al:" + al);
        String[] s1 = new String[al.size()];
        String[] s2 = al.toArray(s1);
        System.out.println("s1:" + Arrays.toString(s1));
        System.out.println("s2:" + Arrays.toString(s2));
        System.out.println("s1 == s2:" + (s1 == s2));

    }
}
