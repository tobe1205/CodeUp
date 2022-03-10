package basic4_2_nestedLoop.Q1081;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //주사위 2개의 면의 개수 n,m 입력 - 10이하의 자연수
        int n = sc.nextInt();
        int m = sc.nextInt();

        /*바깥 for문이 1부터 n까지 바뀌는 각각의 동안에
        안쪽 for문이 1부터 m까지 변하면서 출력된다.
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i+" "+j);
            }
        }
    }
}
