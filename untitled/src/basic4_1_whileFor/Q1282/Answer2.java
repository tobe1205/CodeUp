package basic4_1_whileFor.Q1282;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        //Math.sqrt : 값의 제곱근을 구하는 메서드 double형타입
        double result = Math.sqrt(n);
        //Math.pow(밑,지수) : 제곱함수 입출력 모두 double형타입
        //int k = n - (int) Math.pow((int) result, 2)
        System.out.print(n - (int) Math.pow((int) result, 2)+" "+ (int)result);
    }
}
