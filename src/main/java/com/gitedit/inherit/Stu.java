package com.gitedit.inherit;

/**
 * @author king
 * 以Person 来测试组合
 */
class Stu {
    Person person = new Person("king", 185);
    String major;

    public Stu(String name, int height, String major) {
        this.person.name = name;
        this.person.height = height;
        this.major = major;
    }

    public void study() {
        System.out.printf("姓名：%s,身高:%d,专业:%s 在学习\n", this.person.name, this.person.height, major);
    }
}
