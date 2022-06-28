package com.gitedit.container;

import java.util.*;

/**
 * @author king
 */
public class TestMap {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put(1, "one");
        m1.put(2, "two");
        m1.put(2, 2);
        m1.put(3, "three");
        Object obj = m1.get(2);
        System.out.println("obj = " + obj);
        Map<String, String> map = new HashMap<>();
        map.put("一", "one");
        map.put("二", "two");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        // 增强for循环
        for (Integer tmp : list
        ) {
            System.out.println("tmp = " + tmp);
        }
        // 使用Iterator对象
        for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
            Integer tmp1 = iter.next();
            System.out.println("tmp1 = " + tmp1);
        }
        // 遍历Map
        Map<String, String> map1 = new HashMap<>();
        map1.put("one", "一");
        map1.put("two", "二");
        map1.put("three", "三");
        Set<String> keys = map1.keySet();
        for (String tmp : keys
        ) {
            System.out.println("tmp = " + tmp);
            // 获取values
            System.out.println(map1.get(tmp));
        }
        // 使用entrySet 遍历
        Set<Map.Entry<String, String>> entrySet = map1.entrySet();
        for (Map.Entry e : entrySet) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
