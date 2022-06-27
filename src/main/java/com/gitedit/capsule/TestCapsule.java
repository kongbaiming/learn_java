package com.gitedit.capsule;

import com.gitedit.capsule.a.ByD;
import com.gitedit.capsule.a.User;
import com.gitedit.capsule.b.Tesla;

/**
 * @author king
 * 封装的优点
 * 1、提高代码的安全性
 * 2、提高代码的复用性
 * 3、"高内聚" 封装细节，便于修改内部代码，提高可维护性
 * 4、"低耦合" 简化外部调用，便于调用者使用，便于扩展和写作
 *
 * 封装的简单原则
 * 1、属性一版使用private访问权限
 * 2、属性私有后，提供响应的get/set方法来访问相关属性，这些方法通常是public修饰的
 *    以提供对属性的赋值与读写操作(注： boolean变量的get方法是is开头)
 * 3、一些只用于蓓蕾的辅助性方法可以用private修饰，希望其他调用的方法用public修饰
 */
public class TestCapsule {
    public static void main(String[] args) {
        ByD b1 = new ByD(1, "BYD");
        Tesla t1 = new Tesla(2, "ts");
        b1.test();
        b1.run();
        t1.test();
        t1.run();
        User u01 = new User();
        u01.setName("king");
        u01.setId(10);
        u01.getId();
        u01.setPwd("123456");
        u01.getPwd();
        u01.login();

    }
}
