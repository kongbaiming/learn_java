package com.gitedit.inherit;

/**
 * @author king
 * 测试方法重写
 * public final class Vehicle
 * 添加final后，修饰的类(Vehicle)不能被继承
 */
public class Vehicle {
    public void run() {
        System.out.println("run....");
    }

    public void stop() {
        System.out.println("stop....");
    }

    /**
     * 添加final修时候，方法不能在子类中重写
     */
    public final void addOil() {
        System.out.println("addOil....");
    }
}
