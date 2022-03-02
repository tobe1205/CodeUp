package basic4_1_whileFor.Q1280;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                num -= i;
                System.out.print("-" + i);

            } else {
                num += i;
                System.out.print("+" + i);
            }
        }
        System.out.print("="+num);
    }
}
