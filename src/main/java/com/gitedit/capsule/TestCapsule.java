package com.gitedit.capsule;

import com.gitedit.capsule.a.ByD;
import com.gitedit.capsule.b.Testla;

/**
 * @author king
 * 封装的优点
 * 1、提高代码的安全性
 * 2、提高代码的复用性
 * 3、"高内聚" 封装细节，便于修改内部代码，提高可维护性
 * 4、"低耦合" 简化外部调用，便于调用者使用，便于扩展和写作
 */
public class TestCapsule {
    public static void main(String[] args) {
        ByD b1 = new ByD(1, "BYD");
        Testla t1 = new Testla(2, "ts");
        b1.test();
        b1.run();
        t1.test();
        t1.run();
    }
}
