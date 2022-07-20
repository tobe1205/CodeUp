package basic6_function.Q1556;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정수값 입력

        System.out.println(f(n)); //메서드에서 리턴받은 값 출력
    }

    static int f(int n) {
        int sum = 1;
        for (int i = n; i >= 1; i--) { //n부터 1까지 반복문 수행
            sum *= i; //sum변수에 i값을 곱해서 저장한다.
        }
        return sum;
    }
}
