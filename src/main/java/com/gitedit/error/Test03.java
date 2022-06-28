package com.gitedit.error;

/**
 * @author king
 * 自定义异常
 */
public class Test03 {
    public static void main(String[] args) throws IllegalAgeException {
        Person p = new Person();
        p.setAge(1);
        System.out.println(p.getAge());
    }
}
