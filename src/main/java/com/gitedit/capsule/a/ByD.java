package com.gitedit.capsule.a;

/**
 * @author king
 */
public class ByD extends Car {
    public ByD(int id, String brand) {
        super(id, brand);
    }

    public void test() {
        /*  check 为 private， 无法调用
        super.check();
         */
        super.addOil();
        super.autoLight();
        super.run();
    }
}
