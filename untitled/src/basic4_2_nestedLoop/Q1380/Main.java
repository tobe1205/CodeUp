package basic4_2_nestedLoop.Q1380;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //두 주사위를 굴려 나오는 값 k입력
        int k = sc.nextInt();
        /*
        주사위를 두개 돌릴때 k값이 되는 두 눈을 각각 출력하는 문제이다.
        ex: k값이 5입력
        두 주사위를 굴렸을때 나온 두 눈을 더한 값이 5일 경우를 출력
        두 주사위는 6가지 경우이므로 각각 6번 수행한다. (1~6까지)
        if문 조건 -> 두 주사위를 굴렸을떄 더한 값이 k값
        if(i + j == k) 일때만 출력하게 작성
        i가 1일경우, j는 4일때 5가 됨으로, 1 4 출력
        마찬가지로 for문이 반복될 때마다 5가되는 경우를 출력하게 한다.
         */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == k) {
                    System.out.println(i + " " + j);
                }
            }
        }
        sc.close();
    }
}
