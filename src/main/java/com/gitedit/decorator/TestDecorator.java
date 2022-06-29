package com.gitedit.decorator;

/**
 * @author king
 * 测试装饰器
 */
public class TestDecorator {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iphone20");
        iphone.show();
        IphonePlus iphonePlus = new IphonePlus(iphone);
        iphonePlus.show();
    }
}
