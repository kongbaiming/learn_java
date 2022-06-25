/*
测试构造方法重载
 */
public class User {
    int id;
    String userName;
    String password;

    User(){

    }
    public  User(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(10);
    }
}
