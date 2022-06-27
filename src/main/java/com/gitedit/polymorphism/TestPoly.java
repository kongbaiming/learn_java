package com.gitedit.polymorphism;

import org.jetbrains.annotations.NotNull;

/**
 * @author king
 * 多态是指同一个方法的调用，由于对象不同可能会有不同的行为
 * 1、多态是方法的多态，不是属性的多态（多态与属性无关）
 * 2、多态的存在必要有3个必要条件:继承、方法重写，父类医用指向子类对象
 * 3、父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了
 */
public class TestPoly {
    public static void main(String[] args) {
        animalCry(new Dog());
        animalCry(new Cat());
//        对象转型  向上转型
//        Animal a = new Dog();
//        强制转型
//        Dog a2 = (Dog)a;

    }

    static void animalCry(@NotNull Animal a) {
        a.shout();
    }
}
