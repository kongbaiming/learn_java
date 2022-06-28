package com.gitedit.container;

import java.util.ArrayList;
import java.util.List;

/**
 * @author king
 */
public class TestList {
    public static void main(String[] args) {
        // 有序、可重复
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.remove(0);
        System.out.println("list = " + list);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println("list = " + list);

    }
}
