package basic4_1_whileFor.Q1287;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n단 입력

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < i * n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
