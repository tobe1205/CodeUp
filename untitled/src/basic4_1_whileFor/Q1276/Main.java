package basic4_1_whileFor.Q1276;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정수값

        int num = 1; // 저장할변수

        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        System.out.print(num);

    }
}
