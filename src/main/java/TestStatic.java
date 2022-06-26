/**
 * test static
 *
 * @author king
 * 用static 声明的变量为静态成员变量，也称为类变量有已下特点：
 * 1、从属于类，只有一份，在类被载入时被显式初始化
 * 2、一般用"类名.类属性/方法"来调用
 * 3、在static方法中不可直接访问非static的成员
 * 构造方法用于对象初始化
 * 静态初始化快,用于类的初始化操作
 * 可以初始化static属性
 * 静态初始化块中不能直接访问非static成员
 */
public class TestStatic {
    static String company = "dev";
    static int companyId;

    /*
       静态初始化快
     */
    static {
        System.out.println("类初始化调用");
        companyId = 123;
        company = "king";
        /*
        错误调用
        id = 10;
        */
    }

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
        t1.login(19);
    }

    void login(int id) {
        this.id = id;
        System.out.println("login..." + this.id);
    }

}
