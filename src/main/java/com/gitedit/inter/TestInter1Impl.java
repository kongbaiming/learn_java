package com.gitedit.inter;

/**
 * @author king
 */
public class TestInter1Impl implements TestInter1 {
    static void staticMethod() {
        System.out.println("TestInter1Impl.staticMethod");
    }

    @Override
    public void morn1() {
        System.out.println("TestInter1Impl.morn1");
    }
}
