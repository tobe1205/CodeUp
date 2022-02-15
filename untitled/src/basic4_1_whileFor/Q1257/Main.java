package basic4_1_whileFor.Q1257;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //시작수
        int b = sc.nextInt(); //마지막 수

        for (int i = a; i <= b; i++) {
            //홀수 판단
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
