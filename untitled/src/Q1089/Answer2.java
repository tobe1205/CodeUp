package Q1089;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //시작값
        int d = sc.nextInt(); //등차값
        int n = sc.nextInt(); //n번째 수

        int result = a;

        for (int i = 1; i < n; i++) {
            result = result + d;
        }
        System.out.print(result);

    }
}
