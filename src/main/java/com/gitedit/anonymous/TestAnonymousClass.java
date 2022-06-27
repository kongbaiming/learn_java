package com.gitedit.anonymous;

interface A3 {
    /**
     * test
     */
    void run();
}

/**
 * @author king
 */

public class TestAnonymousClass {
    public static void main(String[] args) {
        TestAnonymousClass tc = new TestAnonymousClass();
        tc.test(new A3() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        });
        tc.test(new A3() {
            @Override
            public void run() {
                System.out.println("匿名内部类新的实现");
            }
        });
    }

    public void test(A3 a) {
        a.run();
    }
}