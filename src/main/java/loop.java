/*
loop
 */
public class loop {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <=100) {
            sum +=i;
            i++;
        }
        System.out.println("sum = " + sum);
        sum = 0;
        for (i =0; i<=100;i++) {
            sum +=i;
        }
        System.out.println("sum = " + sum);

    }
}
