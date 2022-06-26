package com.gitedit.testsuper;

/**
 * @author king
 * super "可以看作是直接父类对象的引用"
 * 可以通过super来访问分类中被子类覆盖的方法或者属性
 */
public class TestSuper {
    public static void main(String[] args) {
        Child c1 = new Child(20);
        c1.show();

    }
}
