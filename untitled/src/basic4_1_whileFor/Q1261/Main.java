package basic4_1_whileFor.Q1261;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int b = 0;
        for (int i = 0; i < 10; i++) {
            b = Integer.parseInt(a[i]);
            if (b % 5 == 0) {
                System.out.println(b);
                break;
            }
        }
        if(b%5 != 0) {
            System.out.println(0);
        }
    }
}