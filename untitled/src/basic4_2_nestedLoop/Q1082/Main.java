package basic4_2_nestedLoop.Q1082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //16진법입력을 위해 nextInt(16) 사용
        int n = sc.nextInt(16);
        //for문을 1부터 16까지(미만) 수행
        for (int i = 1; i < 16; i++) {
            // %X 16진법 표기 방법
            System.out.printf("%X*%X=%X\n",n,i,n*i);
        }
    }
}
