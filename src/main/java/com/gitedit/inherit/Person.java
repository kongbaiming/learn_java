package com.gitedit.inherit;

/**
 * @author king
 */
public class Person {
    String name;
    int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void rest() {
        System.out.printf("身高:%d,姓名:%s,休息会儿!", this.height, this.name);
    }
}
