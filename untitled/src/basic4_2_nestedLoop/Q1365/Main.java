package basic4_2_nestedLoop.Q1365;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { //첫째줄 별
            System.out.print("*");
        }
        System.out.println(" ");
        for (int i = 1; i < n - 1; i++) { //7회반복 첫째줄과 마지막줄 제외
            for (int j = 0; j < n; j++) {
    //j==0 왼쪽테두리 별) j==i 왼쪽시작 대각선별) j==n-1-i 오른쪽시작 대각선별) j==n-1 오른쪽테두리별
                if (j == 0 || j == i || j == n - 1 - i || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
