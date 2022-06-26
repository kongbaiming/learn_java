package com.gitedit.inherit;

/**
 * @author king
 * Java 中只有单继承，没有c++那样的多继承
 * Java 中类没有多继承，接口有多继承
 * 子类继承父类，可以得到父类的全部属性和方法(除了父类的构造方法)但不见得都可以访问(比如私有属性和方法)
 * 如果定义一个类时，没有调用extends，则他的父类是: java.lang.Object
 */
public class TestExtends {
    public static void main(String[] args) {
        PersonImpl stu01 = new PersonImpl("king", 185);
        stu01.major = "dev";
        stu01.study();
        stu01.rest();
        System.out.println(stu01 instanceof PersonImpl);
    }

}
