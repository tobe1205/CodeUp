package basic4_1_whileFor.Q1269;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            a = a * b + c;
        }
        System.out.print(a);


    }
}
