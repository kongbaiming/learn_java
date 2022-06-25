import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        int age = 18;
        int _age = 222;
        System.out.println(age);
        System.out.println(_age);
        byte id = 12;
        short tokenId = 12344;
        long longId = 1212324233534353L;
        System.out.println(longId * 100000);
        System.out.println(65);
        System.out.println(065);
        System.out.println(0x65);
        System.out.println(0b0001110001);
        float f1 = 0.1f;
        double f2 = 0.1;
        System.out.println(f1 == f2);
        boolean flag = true;
        if (flag) {
            System.out.println(1);
        }
        System.out.println(_age / age);
        System.out.println(_age % age);
        int a = ++age;
        System.out.println(a);
        char testChar = 'A';
        System.out.println(testChar);
        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Z';
        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
        Scanner scanner = new Scanner(System.in);
        long count = 80;
        System.out.println(count * 60 * 24 * 365 * 80);
        System.out.println("请输入姓名:");
        String Username = scanner.nextLine();
        System.out.println("请输入年龄:");
        age = scanner.nextInt();
        System.out.println("请输入月薪:");
        double salary = scanner.nextDouble();
        System.out.println("姓名:" + Username + " " + "年龄:" + age + " " + "月薪:" + salary);
    }
}