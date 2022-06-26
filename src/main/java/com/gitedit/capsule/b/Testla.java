package com.gitedit.capsule.b;

import com.gitedit.capsule.a.Car;

/**
 * @author king
 */
public class Testla extends Car {
    public Testla(int id, String brand) {
        super(id, brand);
    }

    public void test() {
        super.autoLight();
        super.autoLight();
    }
}
