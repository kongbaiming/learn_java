/**
 * test static
 *
 * @author king
 * 用static 声明的变量为静态成员变量，也称为类变量有已下特点：
 * 1、从属于类，只有一份，在类被载入时被显式初始化
 * 2、一般用"类名.类属性/方法"来调用
 * 3、在static方法中不可直接访问非static的成员
 */
public class TestStatic {
    static String company = "dev";
    int id;

    /**
     * 静态方法
     */
    static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic.printCompany();
        TestStatic t1 = new TestStatic();
        t1.login();
    }

    void login() {
        System.out.println("login...");
    }

}
