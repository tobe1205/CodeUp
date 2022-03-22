package basic4_2_nestedLoop.Q1368;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(); //높이
        int k = sc.nextInt(); //밑변
        String d = sc.next(); //방향

        if (d.equals("L")) { //문자비교는 str.equals()을 이용 - 방향 d가 L이라면
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (d.equals("R")) { // 방향 d가 R이라면
            for (int i = h; i > 0; i--) {
                for (int j = i-1; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}
