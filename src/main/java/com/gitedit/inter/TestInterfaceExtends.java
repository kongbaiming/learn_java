package com.gitedit.inter;

interface TestA {
    /**
     * test
     */
    void testA();
}

interface TestB {
    /**
     * test
     */
    void TestB();
}

interface TestC extends TestA, TestB {
    /**
     * test
     */
    void testC();
}

/**
 * @author king
 * 测试接口继承
 */
public class TestInterfaceExtends {
    public static void main(String[] args) {
        TestInter c = new TestInter();
        c.testA();
        c.TestB();
        c.testC();
    }
}
