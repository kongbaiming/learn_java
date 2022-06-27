package com.gitedit.intal;

/**
 * @author king
 * 内部类是一种特殊的类，指的是定义在一个类的内部类
 * 为了方便的使用外部类的相关属性和方法，通常会定义一个内部类。内部类可以直接访问外部类的私有属性
 * 内部类被当做外部类的成员，单外部类不能访问内部类的属性
 * 内部类提供了更好的封装，只能让外部类直接访问
 */
public class TestIntal {
    private int age = 18;

    public static void main(String[] args) {
        // 非静态类的对象必须寄存在一个外部类对象里
        // 先创建外部类对象，然后使用外部类对象创建内部类对象
        TestIntal.Intal1 intal1 = new TestIntal().new Intal1();
        intal1.test1();
    }

    public void show() {
        System.out.println("外部类，age：" + age);
    }

    /**
     * 非静态内部类，不能有静态的方法，静态的属性、静态的初始化快
     */
    class Intal1 {
        private int id = 10010;

        public void test1() {
            System.out.println("内部类的属性：id " + this.id + " 外部类的属性：age " + TestIntal.this.age);
            TestIntal.this.show();
        }
    }

}
