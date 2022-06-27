package com.gitedit.intal;

/**
 * @author king
 * 静态内部类学习
 * 使用要点:
 * 1、静态内部类可以访问外部类的静态成员，不能访问外部类的普通成员
 * 2、静态内部类看做外部类的一个静态成员
 */
public class TestStatic {
    private static int b = 20;
    private int a = 10;

    public static void main(String[] args) {
        // 调用静态内部类
        // 通过new 外部类名.内部类名来创建静态内部类的对象
        TestStatic.Intal2 intal2 = new TestStatic.Intal2();
        intal2.test1();
    }

    static class Intal2 {
        public void test1() {
            System.out.println(b);
        }

    }
}
