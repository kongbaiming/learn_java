package com.gitedit.obj;

/**
 * @author king
 */
public class TestObject {
    public static void main(String[] args) {
        Employee em1 = new Employee(1, "king");
        System.out.println(em1);
        Employee em2 = new Employee(2, "kk");
        System.out.println(em2);
        System.out.println(em1.equals(em2));
        Employee em3 = new Employee(2, "kk1");
        System.out.println(em2.equals(em3));

    }
}
