package practice02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1010번 : 정수 1개 입력받아 그대로 출력하기
        /*int n;
        n = sc.nextInt();
        System.out.printf("%d",n);*/

        // 1011번 : 문자 1개 입력받아 그대로 출력하기
        /*String x;
        x = sc.next();
        System.out.print(x);*/

        // 1012번 : 실수 1개 입력받아 그대로 출력하기
        /*float f = sc.nextFloat();
        System.out.printf("%f",f);*/

        // 1013번 : 정수 2개 입력받아 그대로 출력하기
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d",a,b);*/

        //1014번 : 문자 2개 입력받아 순서 바꿔 출력하기
        /*String x = sc.next();
        String y = sc.next();
        System.out.printf("%s %s",y,x);*/

        //1015번 : 실수 입력받아 둘째까지 출력하기
        /*float a = sc.nextFloat();
        System.out.printf("%.2f", a);*/

        //1017번 : 정수 1개 입력받아 3번 출력하기
        /*int x = sc.nextInt();
        System.out.printf("%d %d %d",x,x,x);*/

        //1018번 : 시간입력받아 그대로 출력하기
        /*String time = sc.nextLine();
        System.out.print(time);*/

        //1019번 : 연월일 입력받아 그대로 출력하기
        String date = sc.nextLine();

        String[] arr = date.split("\\.");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);

        System.out.printf("%04d.%02d.%02d",A,B,C);

    }
}



