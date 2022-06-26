package com.gitedit.capsule.b;

import com.gitedit.capsule.a.Car;

/**
 * @author king
 */
public class Tesla extends Car {
    public Tesla(int id, String brand) {
        super(id, brand);
    }

    public void test() {
        super.autoLight();
        super.run();
    }
}
