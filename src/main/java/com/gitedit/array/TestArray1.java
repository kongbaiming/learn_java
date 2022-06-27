package com.gitedit.array;

/**
 * @author king
 */
public class TestArray1 {
    private int id;
    private String name;

    public TestArray1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        TestArray1[] testArray1 = new TestArray1[3];
        testArray1[0] = new TestArray1(100, "king");
        testArray1[1] = new TestArray1(101, "daYang");
        testArray1[2] = new TestArray1(102, "kk");
        for (TestArray1 tmp : testArray1) {
            System.out.println(tmp.toString());
        }
        TestArray1[] testArray2 = {new TestArray1(1, "kk"), new TestArray1(2, "test")};
        for (TestArray1 tmp : testArray2) {
            System.out.println(tmp.toString());
        }
    }

    @Override
    public String toString() {
        return "TestArray1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
