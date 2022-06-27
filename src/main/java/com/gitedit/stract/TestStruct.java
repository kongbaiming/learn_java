package com.gitedit.stract;

/**
 * @author king
 * 抽象方法
 * 使用abstract 修饰的方法，没有方法体，是有声明
 * 定义的一种规范，子类必须要给抽象方法提供具体的实现
 * 抽象类
 * 包含抽象方法的类就是抽象类
 * 通过抽象类，我们就可以做到严格限制子类的设计，使子类间更加的通用
 * **************************
 * 抽象类的使用要点
 * 1、有抽象方法的类只能定义成抽象类
 * 2、抽象类不能实例化，即不能用new来实例化抽象类
 * 3、抽象类可以包含属性、方法、构造方法，但是构造方法不能用来new实例，只能用来被子类调用
 * 4、抽象类只能用来被继承
 * 5、抽象类方法必须被子类实现
 */
public class TestStruct {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sleep();
        dog.shout();
        cat.sleep();
        cat.shout();

    }
}
