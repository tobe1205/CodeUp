package basic4_2_nestedLoop.Q1370;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int r = sc.nextInt();

        for (int k = 0; k < r; k++) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for (int i = h - 2; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

            }
        }
    }
}

