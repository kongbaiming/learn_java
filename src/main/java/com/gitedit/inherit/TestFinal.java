package com.gitedit.inherit;

/**
 * @author king
 * final关键字的作用：
 * 修饰变量： 被他修饰德尔变量不可改变，赋值后不可被重新赋值
 * final int MAX_SPEED = 120;
 * 修饰方法：该方法不可被子类重写。但是可以重载！
 * final void study() {}
 * 修饰类：修饰的类不能被继承。比如：Math、String等
 * final class A {}
 */
public class TestFinal {
    public static void main(String[] args) {
        // 常量只能赋值一次
        final int maxSpeed = 120;
    }
}
