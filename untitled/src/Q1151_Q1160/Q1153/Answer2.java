package Q1151_Q1160.Q1153;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        //삼항연산자 사용
        System.out.println((a>b)? ">": (a<b)? "<":"=");

    }
}
