package com.gitedit.stract;

/**
 * @author king
 */
public abstract class Animal {
    /**
     * 抽象方法，子类实现
     */
    public abstract void shout();

    public void sleep() {
        System.out.println("睡觉");
    }
}
