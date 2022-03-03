package basic4_1_whileFor.Q1283;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt(); //투자한 액수
        int b = sc.nextInt(); //투자 일 수

        double c = a;

        for (int i = 0; i < b; i++) {
            double d = sc.nextInt();
            c = (c + (c * (d / 100)));
        }
        System.out.printf("%.0f\n", c - a);
        if (a > c) {
            System.out.print("bad");
        } else if (a == c) {
            System.out.print("same");
        } else {
            System.out.print("good");
        }
    }
}
