package basic4_2_nestedLoop.Q1367;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n입력

        for (int i = n; i > 0; i--) { // n만큼 줄의 개수
            for (int j = i - 1; j > 0; j--) { // i-1부터 0까지 공백 출력
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) { //공백 출력이 끝나고 난 후 n개 만큼 별표 출력
                System.out.print("*");
            }
            System.out.println(); //줄에 출력이 끝나면 줄바꿈
        }
    }
}
