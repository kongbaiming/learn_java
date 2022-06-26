package com.gitedit.test;

/**
 * package 位于类的第一句非注释语句
 *
 * @author king
 */
public class Car {
    String name;

    public void stop(String name) {
        this.name = name;
        System.out.println("name = " + name);
    }
}
