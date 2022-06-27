package com.gitedit.innerClass;

/**
 * @author king
 * 测试局部内部类
 */
public class TestInnerClass {
    public static void main(String[] args) {
        new TestInnerClass().show();
    }

    public void show() {
        System.out.println("外部类，step1:");
        class Inner1 {
            public void run() {
                System.out.println("内部类，step2:");
            }
        }
        // 本方法里直接使用内部类
        new Inner1().run();
    }

}
