package com.gitedit.inherit;

/**
 * @author king
 * PersonImpl 相同的实现，使用了继承
 * Student 未被使用
 */
public class Student {
    String name;
    int height;
    String major;

    public Student(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }

    public void rest() {
        System.out.printf("身高:%d,姓名:%s,专业:%s,休息会儿!", height, name, major);
    }

    public void study() {
        System.out.printf("身高:%d,姓名:%s,专业:%s,在学习!", height, name, major);
    }
}
