package com.gitedit.inter;

/**
 * 飞行接口
 */
interface Volant {
    /**
     * public static final int FLY_HEIGHT = 120
     */
    int FLY_HEIGHT = 120;

    /**
     * public abstract void fly();
     */
    void fly();

}

/**
 * Honest
 */
interface Honest {
    /**
     * helpOthers
     */
    void helpOthers();
}

/**
 * @author king
 * 接口全面实现了规范和具体实现的分离
 * 区别
 * 普通类： 具体实现
 * 抽象类： 具体实现，规范（抽象方法）
 * 接  口： 规范
 * ***************************
 * 子类通过implements来实现接口中的规范
 * 接口不能创建实例，但是可以用来声明变量类型
 * 接口不能创建实例，但是可用于声明引用变量类型
 * 一个类实现了接口，必须实现接口中的所有方法，并且这个方法只能是public的
 * JDK1.8之前，接口只能包含静态常量，抽象方法，不能有普通属性、构造方法、普通方法
 * JDK1.8之后，接口中包含普通的静态方法、默认方法
 */


public class TestInterface {
    public static void main(String[] args) {
        Angel a = new Angel();
        a.fly();
        a.helpOthers();
        Bird b = new Bird();
        b.fly();
    }
}
