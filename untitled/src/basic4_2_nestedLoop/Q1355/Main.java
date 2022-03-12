package basic4_2_nestedLoop.Q1355;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //길이 n 입력

        for (int i = 0; i < n; i++) { //줄 수를 정하는 for문 n만큼 반복
           //공백의 수를 정하는 for문 i보다 작을때까지 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //별의 수를 정하는 for문 k가 i보다 클때만 별표 출력
            for (int k = n; k > i; k--) {
                System.out.print("*");
            }
            System.out.println(); //한줄의 for문수행이 마무리되면 줄바꿈
        }

    }
}
