package basic4_2_nestedLoop.Q1358;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n 입력 n은 홀수

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = i + 2; j <= n; j += 2) {
                    System.out.print(" ");
                }
            }
        }
    }
}
