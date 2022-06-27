package com.gitedit.inter;

interface TestInter1 {
    /**
     * 测试静态方法
     */
    static void staticMethod() {
        System.out.println("TestInter1.staticMethod");
    }

    /**
     * 测试接口的默认方法
     */
    default void morn1() {
        System.out.println("TestInter1.morn1");
    }

    /**
     * 测试接口的默认方法
     */
    default void morn2() {
        System.out.println("TestInter1.morn2");
    }
}

/**
 * @author king
 * 测试接口的默认方法，静态方法
 * 静态方法
 * 1、接口中同时还可以定义静态方法，静态方法通过接口明调用
 * 2、如果是先类中定义了相同名字的静态方法，那就是完成不同的方法，直接从属于实现类，通过类名直接调用
 */
public class TestInterface3 {
    public static void main(String[] args) {
        TestInter1Impl t = new TestInter1Impl();
        // morn1 重写
        t.morn1();
        // morn2 未重写
        t.morn2();
        // 通过接口名和方法名调用
        TestInter1.staticMethod();
        // 调用实现类的静态方法
        TestInter1Impl.staticMethod();
    }
}
