package Q1074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //정수 입력
        int n = sc.nextInt();

        //입력받은 값 n부터 0까지 1씩 차감한후 출력
        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
