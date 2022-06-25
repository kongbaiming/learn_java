/*
流程控制
 */
public class processControl {
    public static void main(String[] args) {
        // 10以内随机数
        int r = (int)(Math.random()*10);
        if (r<3) {
            System.out.println("打印数字小");
        }else {
            System.out.println("r = " + r);
        }
        byte month = 2;
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("春季！");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季！");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季！");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季！");
                break;
            default:
                System.out.println("input err");
        }

    }
}
