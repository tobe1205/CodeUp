package basic4_2_nestedLoop.Q1357;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //길이 n입력

        for (int i = 1; i <= n; i++) { // 줄 수를 위한 for문 n번째 1~n번째 줄
            for (int j = 1; j <= i; j++) { //별을 찍기 위한 for문 1부터 ~ i까지
                System.out.print("*"); //"*" 출력
            }
            System.out.println(); //그 줄에 입력이 끝나면 줄바꿈 처리
        }
        //for문이 끝나고 다음 for문 수행
        for (int i = n-1; i > 0; i--) { //숫자가 다시 작아져야하고, n-1부터 시작 1~n-1번째 줄
            for (int j = i; j > 0; j--) { //j는 i부터 0까지 감소시킬 때
                System.out.print("*"); //"*" 출력
            }
            System.out.println(); //그 줄 입력이 끝나면 줄바꿈 처리
        }

    }
}
