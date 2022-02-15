package basic4_1_whileFor.Q1260;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++) { //a부터 b까지 반복문 실행
            if(i % 3 == 0){  //i값이 3의 배수이면
                sum+= i; //sum에 i값을 더한다.
            }
        }
        System.out.print(sum);
    }
}
