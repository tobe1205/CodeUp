package basic4_2_nestedLoop.Q1351;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt(); // 시작 단수
        int end = sc.nextInt();  // 마지막 단수

        // 시작 단수부터 end단까지 수행될때, 안쪽 for문이 1~ 9까지 수행
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}
