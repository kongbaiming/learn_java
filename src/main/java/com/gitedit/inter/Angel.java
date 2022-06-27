package com.gitedit.inter;

/**
 * @author king
 */
public class Angel implements Volant, Honest {
    /**
     * public abstract void fly();
     */
    @Override
    public void fly() {
        System.out.println("天使飞飞飞");
    }

    @Override
    public void helpOthers() {
        System.out.println("天使帮助他人");
    }
}
