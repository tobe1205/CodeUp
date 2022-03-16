package basic4_2_nestedLoop.Q1361;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //계단의 높이

        for (int i = 1; i <= n; i++) { //층을 구하기 위한 for문
            if(i>1){ //첫번째 줄을 제외한 나머지줄은
                for (int j = 0; j < i-1; j++) { //i-1만큼 빈칸을 출력한다.
                System.out.print(" ");
                }
            }
            for (int j = 0; j < 2; j++) { //빈칸을 출력한 이후에는 별을 2개씩 찍게되고
                System.out.print("*");

            }
            System.out.println(); //그 줄의 모든 출력이 완료되면 줄바꿈한다.
        }

    }
}
