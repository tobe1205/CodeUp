package Q1090;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //시작값
        int r = sc.nextInt(); //등비의 값
        int n = sc.nextInt(); //n번째 수

        long result = a * (long)Math.pow(r,n-1);
        System.out.println(result);

    }
}
