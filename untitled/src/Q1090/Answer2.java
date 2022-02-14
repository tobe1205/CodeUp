package Q1090;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //시작값
        int r = sc.nextInt(); //등비값
        int n = sc.nextInt(); //n번째 수

        long result = a;

        for (int i = 1; i < n; i++) {
            result = result * r;
        }
        System.out.print(result);
    }
}
