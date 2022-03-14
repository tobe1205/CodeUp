package basic4_2_nestedLoop.Q1356;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //길이 입력

        for (int i = 0; i < n; i++) { // 줄 수를 정하는 for문
            if (i == 0 || i == n - 1) { // 첫번째 줄과, 마지막 줄일때
                for (int j = 0; j < n; j++) { //n 만큼 "*"출력
                    System.out.print("*");
                }
            } else { //그 이외 나머지 줄에는
                System.out.print("*"); //"*"를 하나 찍고
                for (int j = 0; j < n - 2; j++) { //"*"다음부터 마지막번째 전까지
                    System.out.print(" ");//공백을 찍는다.
                }
                System.out.print("*"); //다찍혔으면 마지막번째에 "*"을 찍는다.
            }
            System.out.println(); //그 줄에 "*" " "입력이 끝나면 줄바꿈
        }

    }
}
