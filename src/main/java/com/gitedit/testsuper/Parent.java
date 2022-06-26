package com.gitedit.testsuper;

/**
 * @author king
 */
public class Parent {
    int num;


    public Parent(int num) {
        this.num = num;
    }

    public void show() {
        System.out.println("这是父类num" + this.num);
    }

}
