package com.gitedit.test3;

import com.gitedit.test.Car;

import java.util.Date;

import static java.lang.System.out;

/**
 * @author king
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.stop("特斯拉");
        com.gitedit.test2.Car car1 = new com.gitedit.test2.Car();
        car1.stop("bmw");
        Date d = new Date();
        out.println("d = " + d);
    }
}
