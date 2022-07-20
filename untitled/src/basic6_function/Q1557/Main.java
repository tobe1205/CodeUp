package basic6_function.Q1557;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정수형 자연수 입력

        System.out.println(f(n)); //메서드에서 리턴받은 값 출력
    }

    private static int f(int n) {
        int cnt = 0; //약수의 갯수를 카운트하기위한 변수 생성
        for (int i = 1; i <= n; i++) { // n번까지 반복수행
            if (n % i == 0) { //n을 i로나눈 나머지가 0일경우(약수)
                cnt++; //카운트 증가
            }
        }
        return cnt;
    }
}
