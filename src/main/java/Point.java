/*
构造器
描述二维空间的一个点
 */
public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 10);
        System.out.println(p1.x);
        System.out.println(p1.y);
    }
}
