/*
属性 field 方法 method 构造器 constructor
 */
public class Student {
    // 静态特征
    int id;
    String name;
    int score;
    int age;

    // 方法（动态性为）(对数据操作)
    public void study() {
        System.out.println(name + "正在学习");
    }

    public static void main(String[] args) {
        // new 创建对象
        // 引用内型
        Student stu01 = new Student();
        stu01.name = "king";
        stu01.age = 18;
        stu01.id = 1;
        stu01.score = 100;
        Student stu02 = new Student();
        stu02.name = "kk";
        stu02.age = 18;
        stu02.id = 2;
        stu02.score = 100;
        stu01.study();
        stu02.study();
    }
}
