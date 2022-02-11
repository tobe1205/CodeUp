package Q1089;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //시작값
        int d = sc.nextInt(); //등차의 값
        int n = sc.nextInt(); //n번째 수

        int result = a + (n - 1)*d;
        System.out.println(result);

    }
}
