package Q1206;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = 0;

        if (a % b == 0) {
            x = a / b;
            System.out.printf("%d*%d=%d", b, x, a);
        } else if (b % a == 0) {
            x = b / a;
            System.out.printf("%d*%d=%d",a,x,b);
        } else
            System.out.println("none");
    }
}
