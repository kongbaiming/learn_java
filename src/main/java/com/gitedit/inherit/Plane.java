package com.gitedit.inherit;

/**
 * @author king
 */
public class Plane extends Vehicle {
    @Override
    public void run() {
        System.out.println("机场起飞");
    }

    @Override
    public void stop() {
        System.out.println("机场降落");
    }
}
