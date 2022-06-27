package com.gitedit.stract;

/**
 * @author king
 */
public class Cat extends Animal {
    /**
     * 抽象方法，子类实现
     */
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}
