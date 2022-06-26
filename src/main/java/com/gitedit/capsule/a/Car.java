package com.gitedit.capsule.a;

/**
 * @author king
 */
public class Car {
    int id;
    String brand;


    public Car(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    void addOil() {
        System.out.println("cat.addOil");
    }

    protected void autoLight() {
        System.out.println("cat.autoLight");
    }

    public void run() {
        System.out.println("cat.run");
    }

    private void check() {
        System.out.println("cat.check");
    }
}
