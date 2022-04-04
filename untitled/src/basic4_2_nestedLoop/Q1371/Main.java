package basic4_2_nestedLoop.Q1371;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {//밑 마름모
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = n-1; j > i; j--) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }

    }

}
