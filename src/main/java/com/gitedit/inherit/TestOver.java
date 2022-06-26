package com.gitedit.inherit;

/**
 * @author king
 * 方法的重写： override
 * 子类通过重写父类的方法可以用自身的行为替换父类的行为
 * 方法的重写是实现堕胎的必要条件
 * 方法的重写需要符合下面的三个要点：
 * 1、方法名、形参列表相同
 * 2、返回值类型和声明异常类型，子类小于等于父类
 * 3、访问权限，子类大于等于父类
 */
public class TestOver {
    public static void main(String[] args) {
        Hores v1 = new Hores();
        v1.run();
        v1.stop();
        Plane p1 = new Plane();
        p1.run();
        p1.stop();
        v1.addOil();
        p1.addOil();
    }
}
