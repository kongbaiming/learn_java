package com.gitedit.decorator;

/**
 * @author king
 */
public class Iphone {
    private String name;

    public Iphone(String name) {
        this.name = name;
    }

    public void show() {
        System.out.printf("%s手机展示\n", name);
    }

}
