package basic4_2_nestedLoop.Q1677;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //StringBuilder 사용도 가능 할듯 공백으로 분리되어 입력이기 때문

        int n = sc.nextInt(); //가로길이
        int m = sc.nextInt(); //세로길이


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j == i && j == 1) || (j == n && i == 1)
                        || (i == m && j == 1) || (i == m && j == n)) {
                    System.out.print("+");
                } else if (i == 1 || i == m) {
                    System.out.print("-");
                } else if (j == 1 || j == n) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

