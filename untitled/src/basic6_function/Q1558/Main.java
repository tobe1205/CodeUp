package basic6_function.Q1558;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(); //int형범위를 초과하기 때문에 long 타입으로 입력

        f(n); //리턴되는 값이 없는 메서드 - 메서드안에서 자체적으로 출력한다.

    }

    private static void f(Long n) {
        long result = 0;

        while (true) {

            /* n을 10으로 나눈 나머지의 값을 result의 저장
            ex) 12345 % 10 = 5 이므로 5를 출력
            그리고 n 을 10으로 나누어 자리수를 버리고 n이 0이될때까지 반복 수행한다.
            12345 / 10 = 1234 -> 1234 % 10 = 4 ... n == 0 break
             */
            result = n % 10;
            System.out.print(result); //result 출력
            n = n / 10;
            if (n == 0) {
                break;
            }
        }
    }
}
