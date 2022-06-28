package com.gitedit.generic;

/**
 * @author king
 * 泛型学习
 */
public class GenericTest<T> {
    public static void main(String[] args) {
        GenericTest<Integer> g1 = new GenericTest<>();
        g1.test(1);
        g1.test1(2);
    }

    public T test(T obj) {
        System.out.println(obj);
        return obj;
    }

    public <N> void test1(N obj) {
        System.out.println(obj);
    }
}
