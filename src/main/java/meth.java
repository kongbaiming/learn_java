/*
方法的重载(overload)是指一个类中可以定义多个方法名相同，但参数不同的方法。
调用时会根据不同的参数自动匹配对应的方法

构成方法重载的条件
1、 不同的含义：形参类型、形参个数、形参顺序不同
2、 只有返回值不同不构成方法的重载
    如: inta(String str){} 和 void a(String str){} 不构成方法重载
3、 只有形参的名称不同，不构成方法的重载
    如： int a(String str){} 与 int a(String s){} 不构成方法重载
 */
public class meth {
    public static void main(String[] args) {
        int a1 = add(100, 200);
        System.out.println("a1 = " + a1);
        System.out.println(sub(200, 100));
        System.out.println(mul(200, 100));
        System.out.println(div(200, 100));
        printInfo();
        System.out.println(add(200.0, 100));
        System.out.println(sub(200, 100,10));
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mul(int n1, int n2) {
        return n1 * n2;
    }

    public static int div(int n1, int n2) {
        return n1 / n2;
    }

    public static void printInfo() {
        System.out.println("no return");
    }
    // 方法名相同，参数类型不同，构成重载
    public static double add(double n1, int n2) {
        return  n1 + n2;
    }
    // 方法名相同，参数个数不同，构成重载
    public static  int sub(int n1, int n2,int n3) {
        return  n1 - n2 - n3;
    }
    /*
 只有返回值不同，不构成重载
    public static double mul(int n1, int n2) {
        return  (double)(n1 + n2) ;
    }
*/

}

