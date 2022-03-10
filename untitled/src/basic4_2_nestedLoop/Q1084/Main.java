package basic4_2_nestedLoop.Q1084;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //r g b 각각 입력 받기
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        //마지막 만들수 있는 rgb 색정보의 개수 출력을 위한 변수 생성
        int cnt = 0;

        //바깥 for문이  r까지 실행되고, 중간 for문이 g까지, 제일 안쪽 for문이 b까지 실행
        //i j k 조합을 제일 안쪽에서 출력하고 cnt 1씩 증가

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    System.out.println(i + " " + j + " " + k);
                    cnt++;
                }
            }
        }
        //모든 for문이 종료되면 cnt 출력
        System.out.println(cnt);
    }
}
