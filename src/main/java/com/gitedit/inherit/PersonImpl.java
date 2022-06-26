package com.gitedit.inherit;

/**
 * @author king
 */
public class PersonImpl extends Person {
    String major;

    public PersonImpl(String name, int height) {
        super(name, height);
    }

    public void study() {
        System.out.printf("身高:%d,姓名:%s,专业:%s,在学习!", height, name, major);
    }

}
