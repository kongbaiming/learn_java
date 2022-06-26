package com.gitedit.testsuper;

/**
 * @author king
 */
public class Child extends Parent {
    public Child(int num) {
        super(num);
    }

    @Override
    public void show() {
        System.out.println("子类num" + num);
        super.num = 30;
        super.show();
    }
}
