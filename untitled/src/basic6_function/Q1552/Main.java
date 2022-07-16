package basic6_function.Q1552;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble(); //x 값 입력

        System.out.printf("%.14f",f(x)); //리턴받은 값 출력
    }

    static double f(double x) {
        /*
        double형 x에서 int타입으로 변환한 x를 빼준뒤 리턴
        예시)
        x = 3.141592...입력
        (int)x = 3 -> int형으로 변환하면 정수 부분을 제외한 소수부분이 삭제된다.
        x - (int)x -> 3.141592.. - 3 = 0.141592... 출력
         */
        return x - (int) x;
    }
}
