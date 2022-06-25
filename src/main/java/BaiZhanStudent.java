/*
BaiZhanStudent
 */
public class BaiZhanStudent {
    int id;
    String studentName;
    int age;
    Computer computer;
    void study() {
        System.out.println(studentName + "在学习，使用的电脑是:" + computer.brand);
    }

    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.brand = "Mac";
        c1.price = 20000;
        BaiZhanStudent stu1 = new BaiZhanStudent();
        stu1.id = 1;
        stu1.computer = c1;
        stu1.age = 18;
        stu1.studentName = "king";
        stu1.study();
    }
}
