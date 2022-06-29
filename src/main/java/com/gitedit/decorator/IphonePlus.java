package com.gitedit.decorator;

/**
 * @author king
 */
public class IphonePlus {
    Iphone iphone;

    public IphonePlus(Iphone iphone) {
        this.iphone = iphone;
    }

    public void show() {
        System.out.println("可以投影");
        iphone.show();
        System.out.println("可以拍照");
    }
}
