package basic4_1_whileFor.Q1275;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정수값
        int k = sc.nextInt(); //제곱값

        double result = Math.pow(n, k); //제곱근 구하는 메소드

        System.out.print((int)result); //int형으로 변환 출력
     }
}
