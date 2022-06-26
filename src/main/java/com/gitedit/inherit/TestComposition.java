package com.gitedit.inherit;

/**
 * @author king
 * 组合的核心是将父类对象作为子类的属性，然后子类通过调用这个属性来获得父类的属性和方法
 * 组合比较灵活。继承只能有一个父类，组合可以有多个属性
 * 对于 "is a" 关系建议使用继承，"has a"关系建议使用组合
 * 查看 Compulte
 */
public class TestComposition {
    public static void main(String[] args) {
        Stu stu = new Stu("kk", 185, "golang");
        stu.study();
        stu.person.rest();
    }
}
