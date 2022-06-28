package com.gitedit.error;

/**
 * @author king
 */
public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age < 0) {
            throw new IllegalAgeException("不合法的年龄");
        }
        this.age = age;
    }
}
