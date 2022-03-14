package basic4_2_nestedLoop.Q1358;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n 입력 n은 홀수

        for (int i = 0; i <= n; i++) { //줄의 수를 정하는 for문
            if (i % 2 != 0) { //i의 값이 홀수일 때
                for (int j = 0; j < i; j++) { //i값 만큼 "*"출력
                    System.out.print("*");
                }
                System.out.println(); //줄바꿈
            } else { //i의 값이 짝수일 때
                for (int j = i + 2; j <= n; j += 2) { // i+2부터 길이 n값까지, j값이 2씩 증가할때마다
                    System.out.print(" ");  //공백 출력
                }
            }
        }
    }
}
