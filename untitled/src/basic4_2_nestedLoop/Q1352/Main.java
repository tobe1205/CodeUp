package basic4_2_nestedLoop.Q1352;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //사각형의 길이
        int n = sc.nextInt();

        //i는 열 즉 총 0~3열동안 for문 실행이라고 생각하자.
        for (int i = 0; i < n; i++) {
            //j는 행 i열에 j행만큼 for문 실행이라고 생각하자.
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
