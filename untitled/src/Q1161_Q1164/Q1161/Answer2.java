package Q1161_Q1164.Q1161;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if ( x % 2 == 0 && y % 2 == 0) System.out.println("짝수+짝수=짝수");
        else if ( x % 2 == 0 && y % 2 == 1) System.out.println("짝수+홀수=홀수");
        else if ( x % 2 == 1 && y % 2 == 0) System.out.println("홀수+짝수=홀수");
        else System.out.println("홀수+홀수=짝수");

    }
}
